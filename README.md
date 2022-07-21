# alura-stickers
AULA 01 - CONSUMINDO UMA API DE FILMES COM JAVA
Links, dicas e notas de aula
Boas-vindas! Chegou a hora de mergulhar em Java com a primeira Imersão Java da Alura!

Nesta primeira aula, vamos construir uma aplicação do zero para consumir a API do IMDb e exibir os filmes mais populares, destacando seus pôsteres e visualizando sua classificação... Tudo isso sem usar nenhuma biblioteca externa!

Abaixo disponibilizamos todo o material para que você acompanhe a aula e avance em seu projeto.

Código da Aula
Clique aqui para acessar o código completo da aula.

API do IMDB fora do ar
A API do IMDB, usada durante esta aula, saiu do ar hoje. A comunidade criou endereços alternativos que você pode usar no lugar da URL, são eles:

(https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060) criada pelo @rezendecas
(https://alura-imdb-api.herokuapp.com/movies) criada pelo Jhon Santana
(https://api.mocki.io/v2/549a5d8b) criada pelo instrutor Alexandre Aquiles
(https://alura-filmes.herokuapp.com/conteudos) criada pela instrutora Jacqueline Oliveira
(https://raw.githubusercontent.com/alexfelipe/imersao-java/json/top250.json) criada pelo instrutor Alex Felipe
Para utilizar os endereços alternativos, troque a URL da aula pelas novas URLs:

// fazer uma conexão HTTP e buscar os top 250 filmes
// String url = "https://imdb-api.com/en/API/Top250Movies/k_0ojt0yvm";
String url = "https://api.mocki.io/v2/549a5d8b"; // usando endereço alternativo
No canal #material da Aula 1, lá no Discord, você pode ver as alternativas e um vídeo preparado pelo instrutor Alexandre Aquiles para consumir a API do The Movie Data Base, uma alternativa ao IMDB!

Links citados
Os 250 melhores filmes de acordo com a classificação do IMDB.

A documentação da API do IMDB.

Instalação do Visual Studio Code com o Coding Pack para Java

Documentação da classe HttpRequest do pacote java.net.http.

Classe pronta que utiliza Expressões Regulares para fazer parse de um JSON.

Biblioteca Jackson, que faz parse de JSON.

Site que ajuda a entender Expressões Regulares.

Artigo: Como deixar no seu GitHub com um README interessante.

O endpoint da API do IMDB que devolve os 250 melhores filmes: https://imdb-api.com/en/API/Top250Movies/ + SUA-API-KEY

Desafios desta aula
Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.

Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!

Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente

Mudar o JsonParser para usar uma biblioteca de parsing de JSON como Jackson ou GSON

Desafio supremo: criar alguma maneira para você dar uma avaliação ao filme, puxando de algum arquivo de configuração OU pedindo a avaliação para o usuário digitar no terminal.

Material complementar
Artigo na Alura “O que é JSON?”.

Artigo na Alura sobre como pintar o terminal, com tabelinha de cores e negrito.

Artigo na Alura sobre como usar VS Code para codar em Java.
