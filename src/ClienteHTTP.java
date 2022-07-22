import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ClienteHTTP {
    String url;

    // pegar dados api do arquivo .properties

    public String buscaDados(String url) {
        String body = null;
        try {
            // criar conexao HTTP e busca os top 250 filmes da API em json
            URI endereco = URI.create(url);
            var cliente = HttpClient.newHttpClient();
            var requisicao = HttpRequest.newBuilder(endereco).GET().build();
            HttpResponse<String> resposta;
            resposta = cliente.send(requisicao, BodyHandlers.ofString());
            body = resposta.body();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return body;
    }

}
