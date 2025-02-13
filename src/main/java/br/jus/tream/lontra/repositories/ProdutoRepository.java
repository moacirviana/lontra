package br.jus.tream.lontra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jus.tream.lontra.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Produto findByDescricao(String descricao);
	
}
