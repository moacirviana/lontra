package br.jus.tream.lontra.domain;

import java.math.BigDecimal;

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
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROX_ID")
    @SequenceGenerator(name = "PROX_ID", sequenceName = "PROX_ID", allocationSize = 1)
    private Long id;
    @JsonIgnore
    @ManyToOne
    private Pedido pedido;
    @ManyToOne
    private Produto produto;
    private Integer quantidade;
    private BigDecimal precoUnitario;
}
