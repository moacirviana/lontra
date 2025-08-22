package br.jus.tream.lontra.domain.DTO;

import br.jus.tream.lontra.domain.Cliente;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record ClienteDTO(
    Long id,
    
    @NotBlank(message = "Nome é obrigatório")
    String nome,
    
    @NotBlank(message = "Endereço é obrigatório")
    String endereco,

    @NotBlank(message = "Senha é obrigatória")
    String passwd,

    @NotBlank(message = "CEP é obrigatório")
    String cep,
    
    @Positive(message = "celular é obrigatório")
    String celular,

    Integer ativo
    
    //@Min(value = 0, message = "Stock cannot be negative")
    //int stock
) {
 // Convert Entity → DTO
    public static ClienteDTO fromEntity(Cliente cliente) {
        return new ClienteDTO(
            cliente.getId(),
            cliente.getNome(),
            cliente.getEndereco(),
            null,
            cliente.getCep(),
            cliente.getCelular(),
            cliente.getAtivo()
        );
    }

    // Convert DTO → Entity
    public Cliente toEntity() {
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        cliente.setPasswd(passwd);
        cliente.setCep(cep);
        cliente.setCelular(celular);
        cliente.setAtivo(ativo);
        return cliente;
    }
	
}
