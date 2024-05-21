package br.com.braslar.api.braslarapipedidos.controller;

import br.com.braslar.api.braslarapipedidos.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
