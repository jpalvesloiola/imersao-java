import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoDeLinguagens implements ExtratorDeConteudo{
    
    public List<Conteudo> extrairConteudos(String json) {
        // extrair(parsear) dados (titulo, posters, classificacao...) do json
        var parser = new JsonParser();

        // lista de atributos extraidos do json
        List<Map<String, String>> listaDeConteudos = parser.parse(json);

        // lista de retorno
        List<Conteudo> conteudos = new ArrayList<>();

        // popular Lista de Conteudo
        for (Map<String, String> atributo : listaDeConteudos) {
            var conteudo = new Conteudo(
                    atributo.get("image").replaceAll("(@+)(.*).jpg$", "$1.jpg"),
                    atributo.get("title"));
            conteudos.add(conteudo);
        }
        return conteudos;
    }
}
