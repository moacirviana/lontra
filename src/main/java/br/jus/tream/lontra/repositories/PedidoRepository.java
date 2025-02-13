package br.jus.tream.lontra.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.jus.tream.lontra.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
	@Query("SELECT DISTINCT YEAR(p.datacad) FROM Pedido p")
	List<Integer> findDistinctAno();
	
	List<Pedido> findByCliente_Id(Long idCliente);

}
