# alura-stickers

<section class="mentalista">
  <div class="container">
    <h2 class="mentalista-titulo">
      Aula 01 - Consumindo uma API de filmes com Java
    </h2>
    <h3 class="mentalista-subtitulo">Links, dicas e notas de aula</h3>
    <div
      class="cosmos-container cosmos-content imersao-dados cosmos-container-spacing"
    >
      <p>
        Boas-vindas! <strong>Chegou a hora de mergulhar em Java</strong> com a
        primeira Imersão Java da Alura!
      </p>
      <p>
        Nesta primeira aula, vamos construir uma aplicação do zero para consumir
        a API do IMDb e exibir os filmes mais populares, destacando seus
        pôsteres e visualizando sua classificação... Tudo isso sem usar nenhuma
        biblioteca externa!
      </p>
      <p>
        Abaixo disponibilizamos todo o material para que você acompanhe a aula e
        avance em seu projeto.
      </p>
      <h2>Código da Aula</h2>
      <p>
        <a
          href="https://github.com/alura-cursos/imersao-java/tree/aula1"
          target="_blank"
          rel="noopener"
          >Clique aqui</a
        >
        para acessar o código completo da aula.
      </p>
      <h2>API do IMDB fora do ar</h2>
      <p>
        A API do IMDB, usada durante esta aula, saiu do ar hoje. A comunidade
        criou endereços alternativos que você pode usar no lugar da URL, são
        eles:
      </p>
      <ul>
        <li>
          (<a
            href="https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060"
            target="_blank"
            rel="noopener"
            >https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060</a
          >) criada pelo @rezendecas
        </li>
        <li>
          (<a
            href="https://alura-imdb-api.herokuapp.com/movies"
            target="_blank"
            rel="noopener"
            >https://alura-imdb-api.herokuapp.com/movies</a
          >) criada pelo Jhon Santana
        </li>
        <li>
          (<a
            href="https://api.mocki.io/v2/549a5d8b"
            target="_blank"
            rel="noopener"
            >https://api.mocki.io/v2/549a5d8b</a
          >) criada pelo instrutor Alexandre Aquiles
        </li>
        <li>
          (<a
            href="https://alura-filmes.herokuapp.com/conteudos"
            target="_blank"
            rel="noopener"
            >https://alura-filmes.herokuapp.com/conteudos</a
          >) criada pela instrutora Jacqueline Oliveira
        </li>
        <li>
          (<a
            href="https://raw.githubusercontent.com/alexfelipe/imersao-java/json/top250.json"
            target="_blank"
            rel="noopener"
            >https://raw.githubusercontent.com/alexfelipe/imersao-java/json/top250.json</a
          >) criada pelo instrutor Alex Felipe
        </li>
      </ul>
      <p>
        Para utilizar os endereços alternativos, troque a URL da aula pelas
        novas URLs:
      </p>
      <pre><code class="hljs java"><span class="hljs-comment"><span class="hljs-comment">// fazer uma conexão HTTP e buscar os top 250 filmes</span></span>
<span class="hljs-comment"><span class="hljs-comment">// String url = "https://imdb-api.com/en/API/Top250Movies/k_0ojt0yvm";</span></span>
String url = <span class="hljs-string"><span class="hljs-string">"https://api.mocki.io/v2/549a5d8b"</span></span>; <span class="hljs-comment"><span class="hljs-comment">// usando endereço alternativo</span></span></code></pre>
      <p>
        No canal <strong>#material da Aula 1</strong>, lá no Discord, você pode
        ver as alternativas e um vídeo preparado pelo instrutor Alexandre
        Aquiles para consumir a API do The Movie Data Base, uma alternativa ao
        IMDB!
      </p>
      <h2>Links citados</h2>
      <ul>
        <li>
          <p>
            Os
            <a
              href="https://www.imdb.com/chart/top/"
              target="_blank"
              rel="noopener"
              >250 melhores filmes de acordo com a classificação do IMDB</a
            >.
          </p>
        </li>
        <li>
          <p>
            A
            <a href="https://imdb-api.com/api" target="_blank" rel="noopener"
              >documentação da API do IMDB</a
            >.
          </p>
        </li>
        <li>
          <p>
            Instalação do Visual Studio Code com o
            <a
              href="https://code.visualstudio.com/docs/languages/java#_install-visual-studio-code-for-java"
              target="_blank"
              rel="noopener"
              >Coding Pack para Java</a
            >
          </p>
        </li>
        <li>
          <p>
            Documentação da classe
            <a
              href="https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html"
              target="_blank"
              rel="noopener"
              >HttpRequest do pacote java.net.http</a
            >.
          </p>
        </li>
        <li>
          <p>
            Classe pronta que utiliza Expressões Regulares para fazer
            <a
              href="https://gist.github.com/alexandreaquiles/cf337d3bcb59dd790ed2b08a0a4db7a3"
              target="_blank"
              rel="noopener"
              >parse de um JSON</a
            >.
          </p>
        </li>
        <li>
          <p>
            <a
              href="https://github.com/FasterXML/jackson"
              target="_blank"
              rel="noopener"
              >Biblioteca Jackson, que faz parse de JSON</a
            >.
          </p>
        </li>
        <li>
          <p>
            Site que ajuda a entender
            <a href="https://regex101.com/" target="_blank" rel="noopener"
              >Expressões Regulares</a
            >.
          </p>
        </li>
        <li>
          <p>
            Artigo:
            <a href="https://www.alura.com.br/artigos/escrever-bom-readme"
              >Como deixar no seu GitHub com um README interessante</a
            >.
          </p>
        </li>
        <li>
          <p>
            O endpoint da API do IMDB que devolve os 250 melhores filmes:
            <a
              href="https://imdb-api.com/en/API/Top250Movies/"
              target="_blank"
              rel="noopener"
              >https://imdb-api.com/en/API/Top250Movies/</a
            >
            + <strong>SUA-API-KEY</strong>
          </p>
          <h2>Desafios desta aula</h2>
        </li>
      </ul>
      <ol>
        <li>
          <p>
            Consumir o endpoint de filmes mais populares da API do IMDB. Procure
            também, na documentação da API do IMDB, o endpoint que retorna as
            melhores séries e o que retorna as séries mais populares.
          </p>
        </li>
        <li>
          <p>
            Usar sua criatividade para deixar a saída dos dados mais bonitinha:
            usar emojis com código UTF-8, mostrar a nota do filme como
            estrelinhas, decorar o terminal com cores, negrito e itálico usando
            códigos ANSI, e mais!
          </p>
        </li>
        <li>
          <p>
            Colocar a chave da API do IMDB em algum lugar fora do código como um
            arquivo de configuração (p. ex, um arquivo .properties) ou uma
            variável de ambiente
          </p>
        </li>
        <li>
          <p>
            Mudar o JsonParser para usar uma biblioteca de parsing de JSON como
            Jackson ou GSON
          </p>
        </li>
        <li>
          <p>
            <strong>Desafio supremo:</strong> criar alguma maneira para você dar
            uma avaliação ao filme, puxando de algum arquivo de configuração OU
            pedindo a avaliação para o usuário digitar no terminal.
          </p>
        </li>
      </ol>
      <h2>Material complementar</h2>
      <ul>
        <li>
          <p>
            Artigo na Alura
            <a href="https://www.alura.com.br/artigos/o-que-e-json"
              >“O que é JSON?”</a
            >.
          </p>
        </li>
        <li>
          <p>
            Artigo na Alura sobre como
            <a
              href="https://www.alura.com.br/artigos/decorando-terminal-cores-emojis"
              >pintar o terminal, com tabelinha de cores e negrito</a
            >.
          </p>
        </li>
        <li>
          <p>
            Artigo na Alura sobre como usar
            <a
              href="https://www.alura.com.br/artigos/desenvolvendo-aplicacoes-java-vs-code"
              >VS Code para codar em Java</a
            >.
          </p>
        </li>
      </ul>
    </div>
  </div>
</section>
