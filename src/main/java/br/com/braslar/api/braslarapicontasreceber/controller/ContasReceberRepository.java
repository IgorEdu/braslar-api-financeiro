package br.com.braslar.api.braslarapicontasreceber.controller;

import br.com.braslar.api.braslarapicontasreceber.domain.ContasReceber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContasReceberRepository extends JpaRepository<ContasReceber, String> {
    @Query(value = """
            select cr.id from ContasReceber cr
            where
            cr.documento = :documento and
            cr.codigoCliente = :codigoCliente and
            cr.parcela = :parcela      
            """)
    String findByDocumentoAndClienteAndParcela(String documento, String codigoCliente, String parcela);

}
