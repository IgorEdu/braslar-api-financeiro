package br.com.braslar.api.braslarapicontasreceber.domain;

import br.com.braslar.api.braslarapicontasreceber.domain.dto.ContasReceberDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "contas_receber")
@Entity(name = "ContasReceber")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ContasReceber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idEmpresa;
    private int banco;
    private String razaoBanco;
    private String dataEmissao;
    private String dataVencimento;
    private String dataRecebimento;
    private String documento;
    private String parcela;
    private String status;
    private String codigoCliente;
    private String razaoCliente;
    private String valor;
    private String codigoCentroCusto;
    private String descricaoCentroCusto;
    private String codigoContaGerencial;
    private String descricaoContaGerencial;

    public ContasReceber(ContasReceberDTO dados){
        this.idEmpresa = dados.idEmpresa();
        this.banco = dados.banco();
        this.razaoBanco = dados.razaoBanco();
        this.dataEmissao = dados.dataEmissao();
        this.dataVencimento = dados.dataVencimento();
        this.dataRecebimento = dados.dataRecebimento();
        this.documento = dados.documento();
        this.parcela = dados.parcela();
        this.status = dados.status();
        this.codigoCliente = dados.codigoCliente();
        this.razaoCliente = dados.razaoCliente();
        this.valor = dados.valor();
        this.codigoCentroCusto = dados.centroCusto();
        this.descricaoCentroCusto = dados.descricaoCentroCusto();
        this.codigoContaGerencial = dados.contaGerencial();
        this.descricaoContaGerencial = dados.descricaoContaGerencial();
    }
}
