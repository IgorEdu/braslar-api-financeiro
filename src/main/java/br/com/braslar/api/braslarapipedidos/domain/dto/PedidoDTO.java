package br.com.braslar.api.braslarapipedidos.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PedidoDTO(
        @JsonProperty("Empresa") int idEmpresa,
        @JsonProperty("Pedido") String numeroPedido,
        @JsonProperty("Cliente") String codigoCliente,
        @JsonProperty("Produto") String codigoProduto,
        @JsonProperty("Emissao") String dataEmissao,
        @JsonProperty("Entrega") String dataEntrega,
        @JsonProperty("Condicao") String condicaoPagamento,
        @JsonProperty("Sinal") double sinal,
        @JsonProperty("Sinal_parc") String sinalParcelado,
        @JsonProperty("Carregado") String pedidoCarregado,
        @JsonProperty("Transportadora") String codigoTransportadora,
        @JsonProperty("Operacao") String operacaoContabil,
        @JsonProperty("Natureza") String naturezaOperacao) {
}
