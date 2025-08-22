package br.jus.tream.lontra.services;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import br.jus.tream.lontra.domain.Cliente;
import br.jus.tream.lontra.domain.DTO.ClienteDTO;
import br.jus.tream.lontra.domain.DTO.ParamsDTO;
import br.jus.tream.lontra.repositories.ClienteRepository;
import br.jus.tream.lontra.repositories.ClienteSpecification;

@Service
@RequiredArgsConstructor
public class ClienteService {
   private final ClienteRepository clienteRepo;

   public List<Cliente> findAll() {
	  return clienteRepo.findAll();
   }
	
   public List<Cliente> findByNomeLike(String nome){
	   String param = String.format("%%%s%%", nome.trim().toUpperCase());
	  return clienteRepo.findByNomeLike(param);
   }
	
   public List<Cliente> findAllLikeNomeAndCelular(@Param("params") ParamsDTO params){
	 return clienteRepo.findAllLikeNomeAndCelular(params);
   }
   
   public List<Cliente> filterBySpecification(ParamsDTO params) {
		Specification<Cliente> spec = ClienteSpecification.filterByParams(params);
		return clienteRepo.findAll(spec, Sort.by("nome"));
	}

    public List<Cliente> findAllByAtivoEquals(Integer ativo) {
        return clienteRepo.findAllByAtivoEquals(ativo);
    }

    public ClienteDTO save(ClienteDTO clienteDTO) {
        Cliente cliente = clienteDTO.toEntity();
        cliente = clienteRepo.save(cliente);
        return ClienteDTO.fromEntity(cliente);
    }

    public List<ClienteDTO> getAllClientes() {
        return clienteRepo.findAll()
            .stream()
            .map(ClienteDTO::fromEntity)
            .toList();
    }
    
    public ClienteDTO update(Long id, ClienteDTO clienteDTO) {
        Cliente cliente = clienteRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        cliente.setAtivo(clienteDTO.ativo());
        cliente.setNome(clienteDTO.nome());
        cliente.setEndereco(clienteDTO.endereco());
        cliente.setPasswd(clienteDTO.passwd());
        cliente.setCep(clienteDTO.cep());
        cliente.setCelular(clienteDTO.celular());
        Cliente updated = clienteRepo.save(cliente);
        return ClienteDTO.fromEntity(updated);
    }
    
    public void delete(Long id) {
        clienteRepo.deleteById(id);
    }
}
