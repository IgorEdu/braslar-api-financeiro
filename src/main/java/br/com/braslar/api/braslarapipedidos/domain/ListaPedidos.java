package br.com.braslar.api.braslarapipedidos.domain;

import br.com.braslar.api.braslarapipedidos.domain.dto.PedidoDTO;
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
public class ListaPedidos {
    @JsonProperty("ListaPedidosVenda")
    private List<PedidoDTO> pedidos;

    public int getSize() {
        return pedidos.size();
    }
}
