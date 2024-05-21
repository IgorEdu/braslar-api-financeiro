package br.com.braslar.api.braslarapipedidos.controller;

import br.com.braslar.api.braslarapipedidos.domain.DadosListagemPedido;
import br.com.braslar.api.braslarapipedidos.domain.ListaPedidos;
import br.com.braslar.api.braslarapipedidos.domain.Pedido;
import br.com.braslar.api.braslarapipedidos.domain.dto.PedidoDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("vendas")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @GetMapping
    public ResponseEntity<Page<DadosListagemPedido>> listAll(
            @PageableDefault(size = 10, sort = { "dataEmissao" }) Pageable paginacao) {
        var page = repository.findAll(paginacao).map(DadosListagemPedido::new);
        return ResponseEntity.ok(page);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<List<ResponseEntity<DadosListagemPedido>>> cadastrar(@RequestBody @Valid String dados,
                                                                               UriComponentsBuilder uriBuilder)
            throws JsonMappingException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<ResponseEntity<DadosListagemPedido>> retornos = new ArrayList<>();

        ListaPedidos produtos = mapper.readValue(dados, ListaPedidos.class);

        repository.flush();
        repository.deleteAll();


        for (int i = 0; i < produtos.getSize(); i++) {
            var pedido = new Pedido(produtos.getPedidos().get(i));
            repository.save(pedido);
            retornos.add(ResponseEntity.created(null).body(new DadosListagemPedido(pedido)));
        }

        return ResponseEntity.ok().body(retornos);
    }

}
