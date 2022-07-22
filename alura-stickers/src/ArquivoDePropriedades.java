
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
*
* @author Robson Fernando Gomes
* http://maguscode.blogspot.com
*
*/
public class ArquivoDePropriedades {

  
    public static Properties getProp() throws IOException{
        Properties props = new Properties();
        FileInputStream file = new FileInputStream("./properties/api.properties");
        props.load(file);
        return props;
    }
}
