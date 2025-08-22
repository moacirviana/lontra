package br.jus.tream.lontra.services;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import br.jus.tream.lontra.domain.Pedido;
import br.jus.tream.lontra.repositories.PedidoRepository;

@Service
@RequiredArgsConstructor
public class PedidoService {
	private final PedidoRepository pedidoRepo;
   // For read-heavy operations
	// @Transactional(readOnly = true) 
	public List<Pedido> findAll() {
		return pedidoRepo.findAll();
	}
	
	public Pedido findById(Long id) {
		return pedidoRepo.findById(id).get();
	}
	
	public List<Integer> findDistinctAno() {
		return pedidoRepo.findDistinctAno();
	} 
	
	public List<Pedido> findByIdCliente(Long idCliente) {
		return pedidoRepo.findByCliente_Id(idCliente);
	}
}
