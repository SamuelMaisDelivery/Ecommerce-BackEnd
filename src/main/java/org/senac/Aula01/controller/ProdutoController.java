package org.senac.Aula01.controller;

import java.util.List;

import org.senac.Aula01.model.Produto;
import org.senac.Aula01.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "*")

public class ProdutoController {
    
    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> get(){
        
        return repository.findAll();
    }

    @PostMapping
     public Produto save(@RequestBody Produto produto){
       return repository.save(produto);
     }
}