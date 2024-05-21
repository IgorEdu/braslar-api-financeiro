package br.com.braslar.api.braslarapipedidos.controller;

import br.com.braslar.api.braslarapipedidos.domain.DadosListagemPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
