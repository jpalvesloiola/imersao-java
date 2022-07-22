<h1>AULA 02 - GERANDO FIGURINHAS PARA WHATSAPP</h1>

<h2>Links, dicas e notas de aula
Boas-vindas! Esta é a segunda aula da Imersão Java.</h2>

Nesta segunda aula vamos criar um gerador de figurinhas explorando outras bibliotecas nativas do Java, para que possamos enviar por Whatsapp os nossos filmes preferidos!

<h3>APIs semelhates ao IMDB:</h3>

<ul>
  <li>(https://api.mocki.io/v2/549a5d8b/Top250Movies)</li>
  <li>(https://api.mocki.io/v2/549a5d8b/MostPopularMovies)</li>
  <li>(https://api.mocki.io/v2/549a5d8b/MostPopularTVs)</li>
  <li>(https://api.mocki.io/v2/549a5d8b/Top250TVs)</li>
</ul>

<h3>Segue também uma solução inspirada na que foi criada ontem pelo instrutor Alex Felipe:</h3>

<li>(https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json)</li>
<li>(https://raw.githubusercontent.com/alura-cursos/imersao-java/api/MostPopularMovies.json)</li>
<li>(https://raw.githubusercontent.com/alura-cursos/imersao-java/api/MostPopularTVs.json)</li>
<li>(https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopTVs.json)</li>

<cite>
  Para utilizar os endereços alternativos, troque a URL da aula pelas novas URLs:

  // String url = "https://imdb-api.com/en/API/Top250Movies/k_0ojt0yvm";
  String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json";
</cite>

<h3>Links citados</h3>
<ul>
  <li>Documentação do pacote javax.imageio, que trata de leitura e escrita de imagens.</li>

  <li>Documentação da classe BufferedImage, que representa uma imagem no Java</li>

  <li>Documentação da classe Graphics2D, a “caneta” que permite escrever, desenhar e imprimir outras imagens em uma imagem original.</li>

  <li>Documentação da abstração InputStream, que representa um fluxo de leitura de dados de qualquer fonte, como arquivos, URLs, entre outros.</li>
</ul>

<h3>Desafios</h3>
<ul>
  <li>Ler a documentação da classe abstrata InputStream.</li>
  <li>Centralizar o texto na figurinha.</li>
  <li>Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas!</li>
  <li>Criar diretório de saída das imagens, se ainda não existir.</li>
  <li>Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.</li>
  <li>Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha!</li>
  <li>Colocar contorno (outline) no texto da imagem.</li>
  <li>Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado.</li>
  <li>Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.</li>
  <li>Desafio supremo: usar alguma biblioteca de manipulação de imagens como OpenCV pra extrair imagem principal e contorná-la.</li>
  <li></li>
  <li></li>
  <li></li>
</ul>

<h3>Material complementar</h3>
<ul>
  <li></li>
  <li>Primeira aula do curso “Java Polimorfismo: entenda herança e interfaces” da Alura.</li>
  <li>Apêndice da apostila “Java e Orientação a Objetos” da Alura sobre o pacote java.io que explica com mais detalhes a abstração InputStream.</li>
</ul>










