package br.jus.tream.lontra.domain;

import java.math.BigDecimal;

import br.jus.tream.lontra.domain.pk.ItemPedidoPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode(of="id")
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class ItemPedido {
    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();

    private Integer quantidade;

    private BigDecimal precoUnitario;
}
