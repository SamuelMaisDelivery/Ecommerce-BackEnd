package org.senac.Aula01.repository;

import org.senac.Aula01.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
 
}
