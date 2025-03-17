package br.jus.tream.lontra.domain.PK;

import java.io.Serializable;

import br.jus.tream.lontra.domain.Pedido;
import br.jus.tream.lontra.domain.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class ItemPedidoPK implements Serializable{
    private Pedido pedido;
    private Produto produto;

    public Long getIdProduto(){
        return this.getProduto().getId();
    }

    public Long getIdPedido(){
        return this.getPedido().getId();
    }
}
