import java.net.URI;
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
        //System.out.println(body);

        // extrair(parsear) dados (titulo, posters, classificacao)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        
        // exibir e manipular dados
        for (Map<String,String> filme : listaDeFilmes) {
            System.out.println("\u001b[37m\u001b[44m\u001b[1m Titulo: " + filme.get("title") + " \u001b[m");
            System.out.println("\u001b[33m\u001b[42m\u001b[1m Poster: " + filme.get("image") + "\u001b[m");
            System.out.printf("\u001b[41m\u001b[26m\u001b[1m Classificação: %s/10\u001b[m\n", filme.get("imDbRating"));
            
            for (int i = 0; i < Float.parseFloat(filme.get("imDbRating")); i++) {
                System.out.print("\u001b[5m⭐");
            }
            System.out.printf("\n\n");
        }
    }
    
}
