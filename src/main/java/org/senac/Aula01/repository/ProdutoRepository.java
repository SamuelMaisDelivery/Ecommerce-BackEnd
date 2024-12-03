package org.senac.Aula01.repository;

import java.util.List;

import org.senac.Aula01.model.Produto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
 List<Produto> findByNomeContains(String filter, Sort sort);
}

