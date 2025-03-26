package br.jus.tream.lontra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jus.tream.lontra.domain.Produto;

import java.math.BigDecimal;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Produto findByDescricao(String descricao);

	List<Produto> findAllByDescricaoLikeAndPrecoLessThanEqual(
			String descricao,
			BigDecimal preco
	);
}
