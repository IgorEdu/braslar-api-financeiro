package br.com.braslar.api.braslarapicontasreceber.domain;

public record DadosListagemContasReceber(
         int id,
         int idEmpresa,
         int banco,
         String razaoBanco,
         String dataEmissao,
         String dataVencimento,
         String dataRecebimento,
         String documento,
         String parcela,
         String codigoCliente,
         String razaoCliente,
         String valor,
         String centroCusto,
         String descricaoCentroCusto,
         String contaGerencial,
         String descricaoContaGerencial
) {

    public DadosListagemContasReceber(ContasReceber contasReceber) {
        this(
                contasReceber.getId(),
                contasReceber.getIdEmpresa(),
                contasReceber.getBanco(),
                contasReceber.getRazaoBanco(),
                contasReceber.getDataEmissao(),
                contasReceber.getDataVencimento(),
                contasReceber.getDataRecebimento(),
                contasReceber.getDocumento(),
                contasReceber.getParcela(),
                contasReceber.getCodigoCliente(),
                contasReceber.getRazaoCliente(),
                contasReceber.getValor(),
                contasReceber.getCodigoCentroCusto(),
                contasReceber.getDescricaoCentroCusto(),
                contasReceber.getCodigoContaGerencial(),
                contasReceber.getDescricaoContaGerencial()
        );
    }
}
