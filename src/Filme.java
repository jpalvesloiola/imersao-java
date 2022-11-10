

public class Filme {
    private String titulo, poster;
    private float classificacao;

    public Filme(String titulo, String poster) {
        this.titulo = titulo;
        this.poster = poster;
    }
    public Filme(String titulo, String poster, float classificacao) {
        this.titulo = titulo;
        this.poster = poster;
        this.classificacao = classificacao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getPoster() {
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }
    public float getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(float classificacao) {
        this.classificacao = classificacao;
    }

    
}
