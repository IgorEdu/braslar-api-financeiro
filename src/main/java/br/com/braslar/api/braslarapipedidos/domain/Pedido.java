package br.com.braslar.api.braslarapipedidos.domain;

import br.com.braslar.api.braslarapipedidos.domain.dto.PedidoDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pedidos")
@Entity(name = "Pedido")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int idEmpresa;
    private String numeroPedido;
    private String codigoCliente;
    private String codigoProduto;
    private String dataEmissao;
    private String dataEntrega;
    private String condicaoPagamento;
    private double sinal;
    private String sinalParcelado;
    private String pedidoCarregado;
    private String codigoTransportadora;
    private String operacaoContabil;
    private String naturezaOperacao;

    public Pedido(PedidoDTO dados){
        this.idEmpresa = dados.idEmpresa();
        this.numeroPedido = dados.numeroPedido();
        this.codigoCliente = dados.codigoCliente();
        this.codigoProduto = dados.codigoProduto();
        this.dataEmissao = dados.dataEmissao();
        this.dataEntrega = dados.dataEntrega();
        this.condicaoPagamento = dados.condicaoPagamento();
        this.sinal = dados.sinal();
        this.sinalParcelado = dados.sinalParcelado();
        this.pedidoCarregado = dados.pedidoCarregado();
        this.codigoTransportadora = dados.codigoTransportadora();
        this.operacaoContabil = dados.operacaoContabil();
        this.naturezaOperacao = dados.naturezaOperacao();
    }
}
