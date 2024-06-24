package br.com.braslar.api.braslarapicontasreceber.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ContasPagarDTO(
        @JsonProperty("Empresa") int idEmpresa,
        @JsonProperty("Banco") int banco,
        @JsonProperty("Razao_banco") String razaoBanco,
        @JsonProperty("Emissao") String dataEmissao,
        @JsonProperty("Vencimento") String dataVencimento,
        @JsonProperty("Pagamento") String dataPagamento,
        @JsonProperty("Documento") String documento,
        @JsonProperty("Parcela") String parcela,
        @JsonProperty("Status") String status,
        @JsonProperty("Codigo_fornecedor") String codigoFornecedor,
        @JsonProperty("Razao_fornecedor") String razaoFornecedor,
        @JsonProperty("Valor") String valor,
        @JsonProperty("Centro_custo") String centroCusto,
        @JsonProperty("Descricao_centro_custo") String descricaoCentroCusto,
        @JsonProperty("Conta_gerencial") String  contaGerencial,
        @JsonProperty("Descricao_conta_gerencial") String descricaoContaGerencial) {
}
