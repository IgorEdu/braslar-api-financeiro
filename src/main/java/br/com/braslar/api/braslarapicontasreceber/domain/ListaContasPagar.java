package br.com.braslar.api.braslarapicontasreceber.domain;

import br.com.braslar.api.braslarapicontasreceber.domain.dto.ContasPagarDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ListaContasPagar {

    @JsonProperty("ListaContasPagar")
    private List<ContasPagarDTO> ListaContasPagar;

    public int getSize(){
        return ListaContasPagar.size();
    }

}
