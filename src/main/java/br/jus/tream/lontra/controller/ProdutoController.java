package br.jus.tream.lontra.controller;

import java.math.BigDecimal;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tream.lontra.domain.Produto;
import br.jus.tream.lontra.domain.DTO.ProdutoDTO;
import br.jus.tream.lontra.response.ApiResponse;
import br.jus.tream.lontra.services.ProdutoService;
import br.jus.tream.lontra.util.ResponseUtil;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoController {
	private final ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		return ResponseEntity.ok(produtoService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse<Produto>> findById(@PathVariable Long id, HttpServletRequest request) {
		var produto = produtoService.findById(id);
		return ResponseEntity.ok(ResponseUtil.success(produto,"Listagem ok", request.getRequestURI()));
				
	}

	@GetMapping("/generic")
	public ResponseEntity<ApiResponse<List<Produto>>> usingResponseGeneric(HttpServletRequest request) {
		var lst = produtoService.findAll();
		return ResponseEntity.ok(ResponseUtil.success(lst,"Listagem ok", request.getRequestURI()));
	}
	
	
	@GetMapping("/pages")
    public ResponseEntity<Page<ProdutoDTO>> listar(@PageableDefault(size = 10, page=0, sort = "descricao", direction = Sort.Direction.ASC) 
                                      Pageable paginacao) {
        var produtos = this.produtoService.findAll(paginacao);
          return ResponseEntity.ok(produtos);
    }

	@GetMapping("/lk/{desc}/preco/{preco}")
	public ResponseEntity<List<Produto>> findAllByNameLikeAndPriceLessThanEqual(@PathVariable String desc, @PathVariable BigDecimal preco)  {
		var produtos = this.produtoService.findAllByDescricaoLikeAndPrecoLessThanEqual(desc, preco);
		return ResponseEntity.ok(produtos);
	}



	/*
	@GetMapping("/pages")
	public ResponseEntity<ApiResponse<List<Produto>>> findAllPage(HttpServletRequest request) {
		var lst = produtoService.findAll();
		return ResponseEntity.ok(ResponseUtil.success(lst,"Listagem ok", request.getRequestURI()));
	}
	*/
}
