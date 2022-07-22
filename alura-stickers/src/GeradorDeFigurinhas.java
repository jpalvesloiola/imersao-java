import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradorDeFigurinhas {    
    public void criar(InputStream inputStream, String nomeArquivo) throws Exception {
        
        // leitura da imagem
        // InputStream inputStream = 
        //                 new FileInputStream("entrada/thegodfather.jpg");
        // InputStream inputStream = 
        //                 new URL("https://imersao-java-apis.s3.amazonaws.com/TopMovies_2.jpg").openStream();
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // cria nova imagem em memoria com transparencia e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura +  200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // copiar imagem original para nova imagem (em memoria)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        // configurar font da nova frase
        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 150);
        graphics.setFont(font);
        graphics.setColor(Color.YELLOW);
        
        // escrever uma frase na nova imagem
        graphics.drawString("OLA, PADRINHO!", 100, novaAltura - 50);

        // escrever nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File("saida/" + nomeArquivo + ".png"));
        
    }
}
