package org.senac.Aula01.controller;

import java.util.List;

import org.senac.Aula01.model.Produto;
import org.senac.Aula01.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.data.domain.Sort;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "*")

public class ProdutoController {
    
    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> get(@RequestParam(required = false, defaultValue = "preco") String order) {
      Sort sort;
  
      // Verifica se o campo é "nome" ou "preco" e define a direção de ordenação
      if (order.equals("preco")) {
          // Se for "preco", ordena por DESC
          sort = Sort.by(Sort.Direction.DESC, "preco");
      } else {
          // Se for "nome" ou qualquer outro valor, ordena por ASC
          sort = Sort.by(Sort.Direction.ASC, "nome");
      }
  
      return repository.findAll(sort);
  }

    @PostMapping
     public Produto save(@RequestBody Produto produto){
       return repository.save(produto);
     }
}
