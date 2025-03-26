package br.jus.tream.lontra.controller;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tream.lontra.domain.Cliente;
import br.jus.tream.lontra.domain.DTO.ParamsDTO;
import br.jus.tream.lontra.response.ApiResponse;
import br.jus.tream.lontra.services.ClienteService;
import br.jus.tream.lontra.util.ResponseUtil;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {
	private final ClienteService clienteService;
	
	@Tag(name = "Clientes", description = "Metodo para listar todos os clientes")
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll() {
		return ResponseEntity.ok(clienteService.findAll());
	}


	@Tag(name = "Clientes", description = "Metodo para listar todos os clientes")
	@GetMapping("/ativos")
	public ResponseEntity<List<Cliente>> findAllByAtivoEquals() {
		return ResponseEntity.ok(clienteService.findAllByAtivoEquals(1));
	}



	@Tag(name = "Clientes response generic", description = "Metodo para listar todos os clientes usando Response Generic")
	@GetMapping("/generic")
	public ResponseEntity<ApiResponse<List<Cliente>>> usingResponseGeneric(HttpServletRequest request) {
		var lst = clienteService.findAll();
		return ResponseEntity.ok(ResponseUtil.success(lst,"Listagem ok", request.getRequestURI()));
	}
	
	@GetMapping("/like/{nome}")
	public ResponseEntity<ApiResponse<List<Cliente>>> findByNomeLike(@PathVariable String nome, HttpServletRequest request) {
		var lst = clienteService.findByNomeLike(nome);
		return ResponseEntity.ok(ResponseUtil.success(lst,"Listagem ok", request.getRequestURI()));
	}	
	
	@GetMapping("/like/{nome}/celular/{celular}")
	public ResponseEntity<ApiResponse<List<Cliente>>> findByNomeAndCelular(@PathVariable String nome, @PathVariable String celular, HttpServletRequest request) {
		var param = new ParamsDTO(nome, celular);
		var lst = clienteService.findAllLikeNomeAndCelular(param);
		return ResponseEntity.ok(ResponseUtil.success(lst,"Listagem ok", request.getRequestURI()));
	}
	
	@GetMapping("/spec")
	public ResponseEntity<List<Cliente>> findBySpecitication(@ModelAttribute ParamsDTO params) {
		var lst = clienteService.filterBySpecification(params);
		return ResponseEntity.ok(lst);
		//return ResponseEntity.ok(ResponseUtil.success(lst,"Listagem com specification ok", request.getRequestURI()));
	}
	
	
	
	
	
}
