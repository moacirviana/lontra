package br.jus.tream.lontra.domain;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "PRODUTO")
@Data
@EqualsAndHashCode(of="id")
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROX_ID")
	@SequenceGenerator(name = "PROXP_ID", sequenceName = "PROX_ID", allocationSize = 1)
	private Long id;
	private String descricao;
	private BigDecimal preco;
    private Boolean ativo;
}
