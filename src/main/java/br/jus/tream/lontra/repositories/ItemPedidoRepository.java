package br.jus.tream.lontra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jus.tream.lontra.domain.ItemPedido;
import br.jus.tream.lontra.domain.pk.ItemPedidoPK;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK> {
		
}
