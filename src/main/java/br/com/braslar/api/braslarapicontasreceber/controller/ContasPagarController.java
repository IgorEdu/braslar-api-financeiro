package br.com.braslar.api.braslarapicontasreceber.controller;

import br.com.braslar.api.braslarapicontasreceber.domain.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("pagar")
public class ContasPagarController {

    @Autowired
    private ContasPagarRepository repository;

    @GetMapping
    public ResponseEntity<Page<DadosListagemContasPagar>> listAll(
            @PageableDefault(size = 10, sort = { "dataEmissao" }) Pageable paginacao) {
        var page = repository.findAll(paginacao).map(DadosListagemContasPagar::new);
        return ResponseEntity.ok(page);
    }


    @PostMapping
    @Transactional
    public ResponseEntity<List<ResponseEntity<DadosListagemContasPagar>>> cadastrar(@RequestBody @Valid String dados,
                                                                                      UriComponentsBuilder uriBuilder)
            throws JsonMappingException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<ResponseEntity<DadosListagemContasPagar>> retornos = new ArrayList<>();

        ListaContasPagar listaContasPagar = mapper.readValue(dados, ListaContasPagar.class);

//        repository.flush();
//        repository.deleteAll();

        for (int i = 0; i < listaContasPagar.getSize(); i++) {
            var contasPagar = new ContasPagar(listaContasPagar.getListaContasPagar().get(i));
//            repository.save(contasPagar);
//            retornos.add(ResponseEntity.created(null).body(new DadosListagemContasPagar(contasPagar)));
        }

        try {
            FileWriter file = new FileWriter("C:\\Users\\ti\\Desktop\\braslar-api-financeiro\\pagar.json");
            file.write(dados);
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok().body(retornos);
    }
}
