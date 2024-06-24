package br.com.braslar.api.braslarapicontasreceber.controller;

import br.com.braslar.api.braslarapicontasreceber.domain.ContasPagar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContasPagarRepository extends JpaRepository<ContasPagar, String> {
    @Query(value = """
            select cp.id from ContasPagar cp
            where
            cp.documento = :documento and
            cp.codigoFornecedor = :codigoFornecedor and
            cp.parcela = :parcela      
            """)
    String findByDocumentoAndFornecedorAndParcela(String documento, String codigoFornecedor, String parcela);

}
