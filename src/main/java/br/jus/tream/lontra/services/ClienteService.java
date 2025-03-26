package br.jus.tream.lontra.services;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import br.jus.tream.lontra.domain.Cliente;
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

}
