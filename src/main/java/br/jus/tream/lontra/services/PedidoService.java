package br.jus.tream.lontra.services;

import java.util.List;
import java.util.Optional;

import br.jus.tream.lontra.domain.ItemPedido;
import br.jus.tream.lontra.repositories.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tream.lontra.domain.Pedido;
import br.jus.tream.lontra.repositories.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	PedidoRepository pedidoRepo;

	@Autowired
	ClienteService clienteService;

	@Autowired
	ProdutoService produtoService;

	@Autowired
	ItemPedidoRepository itemRepo;
	
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

	public Pedido save(Pedido pedido){
		pedido.setId(null);
		//System.out.println(pedido.getId());
		pedido.setCliente(clienteService.findById(pedido.getCliente().getId()));
		pedido = pedidoRepo.save(pedido);
		for (ItemPedido item : pedido.getItens()){
			var produto = produtoService.findById(item.getProduto().getId());
			item.setId(null);
			item.setProduto(produto);
			item.setPedido(pedido);
			item.setPrecoUnitario(produto.getPreco());
		}
		itemRepo.saveAll(pedido.getItens());
		return pedido;
	}
}
