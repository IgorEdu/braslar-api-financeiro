package br.com.braslar.api.braslarapicontasreceber.domain;

import br.com.braslar.api.braslarapicontasreceber.domain.dto.ContasPagarDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "contas_pagar")
@Entity(name = "ContasPagar")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ContasPagar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idEmpresa;
    private int banco;
    private String razaoBanco;
    private String dataEmissao;
    private String dataVencimento;
    private String dataPagamento;
    private String documento;
    private String parcela;
    private String status;
    private String codigoFornecedor;
    private String razaoFornecedor;
    private String valor;
    private String codigoCentroCusto;
    private String descricaoCentroCusto;
    private String codigoContaGerencial;
    private String descricaoContaGerencial;

    public ContasPagar(ContasPagarDTO dados){
        this.idEmpresa = dados.idEmpresa();
        this.banco = dados.banco();
        this.razaoBanco = dados.razaoBanco();
        this.dataEmissao = dados.dataEmissao();
        this.dataVencimento = dados.dataVencimento();
        this.dataPagamento = dados.dataPagamento();
        this.documento = dados.documento();
        this.parcela = dados.parcela();
        this.status = dados.status();
        this.codigoFornecedor = dados.codigoFornecedor();
        this.razaoFornecedor = dados.razaoFornecedor();
        this.valor = dados.valor();
        this.codigoCentroCusto = dados.centroCusto();
        this.descricaoCentroCusto = dados.descricaoCentroCusto();
        this.codigoContaGerencial = dados.contaGerencial();
        this.descricaoContaGerencial = dados.descricaoContaGerencial();
    }
}
