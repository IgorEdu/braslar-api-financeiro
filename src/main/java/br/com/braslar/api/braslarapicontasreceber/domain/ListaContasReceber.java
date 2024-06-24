package br.com.braslar.api.braslarapicontasreceber.domain;

import br.com.braslar.api.braslarapicontasreceber.domain.dto.ContasReceberDTO;
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
public class ListaContasReceber {

    @JsonProperty("ListaContasReceber")
    private List<ContasReceberDTO> ListaContasReceber;

    public int getSize(){
        return ListaContasReceber.size();
    }

}
