package br.jus.tream.lontra.domain;

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
public class Cliente {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROX_ID")
    @SequenceGenerator(name = "PROX_ID", sequenceName = "PROX_ID", allocationSize = 1)
    private Long id;
	private String nome;
    private Boolean ativo;
    private String passwd;
    private String endereco;
    private String cep;
    private String celular;
}
