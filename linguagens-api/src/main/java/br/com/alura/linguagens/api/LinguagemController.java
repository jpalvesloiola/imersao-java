package br.com.alura.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LinguagemController {

    @Autowired
    LinguagemRepository repository;
    
    @GetMapping(value="/linguagens")
    public List<Linguagem> obterLinguagens() {
        
        return repository.findAll();
    }

    @PostMapping(value = "/linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem){
        
        return repository.save(linguagem);
    }

}
