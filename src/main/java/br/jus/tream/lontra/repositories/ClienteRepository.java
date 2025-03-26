package br.jus.tream.lontra.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.jus.tream.lontra.domain.Cliente;
import br.jus.tream.lontra.domain.DTO.ParamsDTO;


public interface ClienteRepository extends JpaRepository<Cliente, Long>, JpaSpecificationExecutor<Cliente> {

	List<Cliente> findAllByAtivoEquals(Integer ativo);

	List<Cliente> findByNomeLike(String nome);
	
	@Query("SELECT c FROM Cliente c WHERE c.nome LIKE %:#{#params.nome}% OR c.celular LIKE %:#{#params.celular}%")
	List<Cliente> findAllLikeNomeAndCelular(@Param("params") ParamsDTO params);
	
}
