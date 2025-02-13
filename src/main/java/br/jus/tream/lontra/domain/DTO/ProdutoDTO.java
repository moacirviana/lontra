package br.jus.tream.lontra.domain.DTO;

import java.math.BigDecimal;

import br.jus.tream.lontra.domain.Produto;

public record ProdutoDTO(Long id, String descricao, BigDecimal preco) {
    public ProdutoDTO(Produto produto){
        this(produto.getId(), produto.getDescricao(), produto.getPreco());
    }
}
