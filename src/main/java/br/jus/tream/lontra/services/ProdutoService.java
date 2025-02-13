package br.jus.tream.lontra.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.jus.tream.lontra.domain.Produto;
import br.jus.tream.lontra.domain.DTO.ProdutoDTO;
import br.jus.tream.lontra.exception.ObjectNotFoundException;
import br.jus.tream.lontra.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	ProdutoRepository produtoRepo;
	
	public Produto findById(Long id){
		Optional<Produto> obj = produtoRepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				    "Produto não encontrado! id:" + id + ", Tipo:" + Produto.class.getName()));
	}

	public List<Produto> findAll() {
		return produtoRepo.findAll();
	}
	
	public Page<ProdutoDTO> findAll(Pageable paginacao){
	        return produtoRepo.findAll(paginacao).map(ProdutoDTO::new);
	}
}
