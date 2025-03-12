package br.jus.tream.lontra.repositories;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("h2")
class ProdutoRepositoryTest {
    @Autowired
    ProdutoRepository produtoRepository;

    @Test
    @DisplayName("Deverá retornar um registro")
    void findByDescricaoSuccess() {
        var desc = "Regua";
        var produto = produtoRepository.findByDescricao(desc);
        assertThat(produto!=null).isTrue();
    }

    @Test
    @DisplayName("Não deverá retornar um registro")
    void findByDescricaoFail() {
        var desc = "Reguas";
        var produto = produtoRepository.findByDescricao(desc);
        assertThat(produto==null).isTrue();
    }
}