package br.com.braslar.api.braslarapipedidos.domain;

public record DadosListagemPedido(
        int idEmpresa,
        String numeroPedido,
        String codigoCliente,
        String codigoProduto,
        String dataEmissao,
        String dataEntrega,
        String condicaoPagamento,
        double sinal,
        String sinalParcelado,
        String pedidoCarregado,
        String codigoTransportadora,
        String operacaoContabil,
        String naturezaOperacao
        ) {

    public DadosListagemPedido(Pedido pedido) {
        this(
            pedido.getIdEmpresa(),
            pedido.getNumeroPedido(),
            pedido.getCodigoCliente(),
            pedido.getCodigoProduto(),
            pedido.getDataEmissao(),
            pedido.getDataEntrega(),
            pedido.getCondicaoPagamento(),
            pedido.getSinal(),
            pedido.getSinalParcelado(),
            pedido.getPedidoCarregado(),
            pedido.getCodigoTransportadora(),
            pedido.getOperacaoContabil(),
            pedido.getNaturezaOperacao()
        );
    }

}


