import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class App {

    public static void main(String[] args) throws Exception {

        // busca API no arquivo properties
        Properties properties = ArquivoDePropriedades.getProp();
        // var extrator = new ExtratorDeConteudoDaNasa();
        ExtratorDeConteudo extrator = new ExtratorDeConteudoDoIMDB();

        // criar conexao HTTP e busca os top 250 filmes
        ClienteHTTP clienteHTTP = new ClienteHTTP();
        String json = clienteHTTP.buscaDados(properties.getProperty("prop.url"));

        // exibir e manipular dados
        var conteudos = extrator.extrairConteudos(json);
        var gerador = new GeradorDeFigurinhas();
        for (Conteudo conteudo : conteudos) {

            InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();

            gerador.criar(inputStream, conteudo.getTitle());
            System.out.println(conteudo.getTitle());
            System.out.println(conteudo.getUrlImagem());
        }
    }

}
