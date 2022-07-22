package br.com.alura.linguagens.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "principaisLinguagens")
public class Linguagem {
    
    @Id
    private String id;
    private String title, image;
    private int rank;

    public Linguagem() {
    }

    public Linguagem(String title, String image, int rank) {
        this.title = title;
        this.image = image;
        this.rank = rank;
    }

    public Linguagem(String title, String image) {
        this.title = title;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public int getRank() {
        return rank;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    
}
