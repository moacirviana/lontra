package br.jus.tream.lontra.controller;

import java.util.List;
import java.net.URI;

import br.jus.tream.lontra.domain.ItemPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import br.jus.tream.lontra.domain.Pedido;
import br.jus.tream.lontra.response.ApiResponse;
import br.jus.tream.lontra.services.PedidoService;
import br.jus.tream.lontra.util.ResponseUtil;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	@Autowired
	PedidoService pedidoService;
	
	@GetMapping()
	public ResponseEntity<ApiResponse<List<Pedido>>> usingResponseGeneric(HttpServletRequest request) {
		var lst = pedidoService.findAll();
		return ResponseEntity.ok(ResponseUtil.success(lst,"Listagem ok", request.getRequestURI()));
	}

	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse<Pedido>> findById(@PathVariable Long id, HttpServletRequest request) {
		var obj = pedidoService.findById(id);
		return ResponseEntity.ok(ResponseUtil.success(obj,"Listagem ok", request.getRequestURI()));
	}
	
	@GetMapping("/anos")
    public ResponseEntity<List<Integer>> findDistinctAno() {
        var lstAnos = this.pedidoService.findDistinctAno();
          return ResponseEntity.ok(lstAnos);
    }
	
	@GetMapping("/cliente/{id}")
	public ResponseEntity<ApiResponse<List<Pedido>>> findByIdCliente(@PathVariable Long id, HttpServletRequest request) {
		var obj = this.pedidoService.findByIdCliente(id);
		return ResponseEntity.ok(ResponseUtil.success(obj,"Listagem ok", request.getRequestURI()));
	}
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Pedido pedido){
		var obj = pedidoService.save(pedido);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
