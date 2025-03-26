package br.jus.tream.lontra.domain.pk;

import br.jus.tream.lontra.domain.Pedido;
import br.jus.tream.lontra.domain.Produto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Embeddable
public class ItemPedidoPK implements Serializable {
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name="produto_id")
    private Produto produto;
}
