package br.com.braslar.api.braslarapipedidos.domain;

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
}
