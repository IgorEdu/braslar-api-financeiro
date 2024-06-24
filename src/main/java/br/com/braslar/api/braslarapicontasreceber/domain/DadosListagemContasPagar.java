package br.com.braslar.api.braslarapicontasreceber.domain;

public record DadosListagemContasPagar(
        int id,
        int idEmpresa,
        int banco,
        String razaoBanco,
        String dataEmissao,
        String dataVencimento,
        String dataPagamento,
        String documento,
        String parcela,
        String codigoFornecedor,
        String razaoFornecedor,
        String valor,
        String centroCusto,
        String descricaoCentroCusto,
        String contaGerencial,
        String descricaoContaGerencial
) {

    public DadosListagemContasPagar(ContasPagar contasPagar) {
        this(
                contasPagar.getId(),
                contasPagar.getIdEmpresa(),
                contasPagar.getBanco(),
                contasPagar.getRazaoBanco(),
                contasPagar.getDataEmissao(),
                contasPagar.getDataVencimento(),
                contasPagar.getDataPagamento(),
                contasPagar.getDocumento(),
                contasPagar.getParcela(),
                contasPagar.getCodigoFornecedor(),
                contasPagar.getRazaoFornecedor(),
                contasPagar.getValor(),
                contasPagar.getCodigoCentroCusto(),
                contasPagar.getDescricaoCentroCusto(),
                contasPagar.getCodigoContaGerencial(),
                contasPagar.getDescricaoContaGerencial()
        );
    }
}
