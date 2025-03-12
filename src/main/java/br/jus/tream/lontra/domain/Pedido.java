package br.jus.tream.lontra.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROX_ID")
	@SequenceGenerator(name = "PROX_ID", sequenceName = "PROX_ID", allocationSize = 1)
	private Long id;
	private LocalDate datacad;
	@ManyToOne
	@JoinColumn(name="id_cliente")
    private Cliente cliente;
	
	@OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens = new ArrayList<>();
	
	public BigDecimal getValorTotal() {
		BigDecimal soma = BigDecimal.valueOf(0.0);;
    	for (ItemPedido item: this.itens) {
    		soma = soma.add(item.getPrecoUnitario());
    	}    	
    	return soma;
    }
}
