package br.com.braslar.api.braslarapicontasreceber.controller;

import br.com.braslar.api.braslarapicontasreceber.domain.ContasReceber;
import br.com.braslar.api.braslarapicontasreceber.domain.DadosListagemContasReceber;
import br.com.braslar.api.braslarapicontasreceber.domain.ListaContasReceber;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
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
@RequestMapping("receber")
public class ContasReceberController {

    @Autowired
    private ContasReceberRepository repository;

    @GetMapping
    public ResponseEntity<Page<DadosListagemContasReceber>> listAll(
            @PageableDefault(size = 10, sort = { "dataEmissao" }) Pageable paginacao) {
        var page = repository.findAll(paginacao).map(DadosListagemContasReceber::new);
        return ResponseEntity.ok(page);
    }


    @PostMapping
    @Transactional
    public ResponseEntity<List<ResponseEntity<DadosListagemContasReceber>>> cadastrar(@RequestBody @Valid String dados,
                                                                                      UriComponentsBuilder uriBuilder)
            throws JsonMappingException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<ResponseEntity<DadosListagemContasReceber>> retornos = new ArrayList<>();

        ListaContasReceber listaContasReceber = mapper.readValue(dados, ListaContasReceber.class);

//        repository.flush();
//        repository.deleteAll();

        for (int i = 0; i < listaContasReceber.getSize(); i++) {
            var contasReceber = new ContasReceber(listaContasReceber.getListaContasReceber().get(i));
//            repository.save(contasReceber);
//            retornos.add(ResponseEntity.created(null).body(new DadosListagemContasReceber(contasReceber)));
        }

        try {
            FileWriter file = new FileWriter("C:\\Users\\ti\\Desktop\\braslar-api-financeiro\\receber.json");
            file.write(dados);
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok().body(retornos);
    }
}
