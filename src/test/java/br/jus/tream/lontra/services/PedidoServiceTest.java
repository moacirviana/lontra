package br.jus.tream.lontra.services;

import br.jus.tream.lontra.domain.Cliente;
import br.jus.tream.lontra.domain.ItemPedido;
import br.jus.tream.lontra.domain.Pedido;
import br.jus.tream.lontra.domain.Produto;
import br.jus.tream.lontra.repositories.ItemPedidoRepository;
import br.jus.tream.lontra.repositories.PedidoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class PedidoServiceTest {
    @InjectMocks
    private PedidoService pedidoService;

    @Mock
    private ClienteService clienteService;

    @Mock
    private ProdutoService produtoService;
    @Mock
    private ItemPedidoRepository itemRepo;

    @Mock
    private PedidoRepository pedidoRepository;

    private Pedido pedido;
    private ItemPedido itemPedido;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        // Inicializa os objetos necessários para os testes
        pedido = new Pedido();
        //pedido.setCliente(new Cliente());
        itemPedido = new ItemPedido();
        itemPedido.setProduto(new Produto());
        pedido.setItens(Collections.singletonList(itemPedido));
    }

    @Test
    public void testSave() {
        Cliente cliente = new Cliente(1L, "Cliente01", true, "passwd", "endereco", "cep", "celular");
        when(clienteService.findById(1L)).thenReturn(cliente);

        Produto p1 = new Produto(3L, "Produto01", new BigDecimal("10.0"), true);
        Produto p2 = new Produto(4L, "Produto02", new BigDecimal("12.0"), true);
        when(produtoService.findById(3L)).thenReturn(p1);
        when(produtoService.findById(4L)).thenReturn(p2);

        // Mock dos serviços e repositórios
        //when(clienteService.findById(anyLong())).thenReturn(new Cliente());
        //when(produtoService.findById(anyLong())).thenReturn(new Produto());
        //when(pedidoRepo.save(any(Pedido.class))).thenReturn(pedido);
        pedido.setCliente(cliente);
        // Chamada ao método
        Pedido savedPedido = pedidoService.save(pedido);

        // Verificações
        assertNotNull(savedPedido);
        verify(pedidoRepository).save(pedido);
        verify(itemRepo).saveAll(pedido.getItens());
    }
}