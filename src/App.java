import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {

        //pegar dados api do arquivo .properties
        Properties prop = ArquivoDePropriedades.getProp();
        
        //criar conexao HTTP e buscar os top 250 filmes  
        URI endereco = URI.create(prop.getProperty("prop.url"));
        var cliente = HttpClient.newHttpClient();
        var requisicao = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> resposta = cliente.send(requisicao, BodyHandlers.ofString());
        String body = resposta.body();

        // extrair(parsear) dados (titulo, posters, classificacao)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        
        // exibir e manipular dados
        var gerador = new GeradorDeFigurinhas();
        for (Map<String,String> filme : listaDeFilmes) {
            String title = filme.get("title");
            String rating = filme.get("imDbRating");
            String urlImage = filme.get("image");
            
            InputStream inputStream = 
                        new URL(urlImage).openStream(); 
            
            gerador.criar(inputStream, title);

            System.out.println("Poster: " + urlImage);
            System.out.println("Titulo: " + title);
            System.out.println("Classificação: " + rating);
            System.out.printf("\n\n");
        }
    }
    
}
