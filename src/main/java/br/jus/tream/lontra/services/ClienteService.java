package br.jus.tream.lontra.services;

import java.util.List;
import java.util.Optional;

import br.jus.tream.lontra.exception.ObjectNotFoundException;
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
public class ClienteService {
   @Autowired
   ClienteRepository clienteRepo;

   public Cliente findById(Long id){
       Optional<Cliente> obj = clienteRepo.findById(id);
       return obj.orElseThrow(() -> new ObjectNotFoundException(
               "Cliente não encontrado! id:" + id + ", Tipo:" + Cliente.class.getName()));
   }

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
	
}
