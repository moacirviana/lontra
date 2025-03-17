package br.jus.tream.lontra.domain;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.jus.tream.lontra.domain.PK.ItemPedidoPK;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
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
@IdClass(ItemPedidoPK.class)
public class ItemPedido {
    @Id
    @JsonIgnore
    @ManyToOne
    private Pedido pedido;
    
    @Id
    @ManyToOne
    private Produto produto;
    private Integer quantidade;
    private BigDecimal precoUnitario;
}
