package br.jus.tream.lontra.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ParamsDTO {
    private Long id;	
	private String nome;
	private String celular;
	private String cep;
	
	public ParamsDTO(String nome, String celular) {
		this.nome = nome;
		this.celular = celular;
	}
	
	
}
