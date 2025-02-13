package br.jus.tream.lontra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	
}
