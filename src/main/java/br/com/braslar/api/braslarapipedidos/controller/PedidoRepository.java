package br.com.braslar.api.braslarapipedidos.controller;

import br.com.braslar.api.braslarapipedidos.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PedidoRepository extends JpaRepository<Pedido, String> {
    @Query(value = """
            select p.id from Pedido p
            where
            p.numeroPedido = :numeroPedido
            """)
    String findByPedido(String numeroPedido);

}
