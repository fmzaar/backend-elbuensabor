package com.magiestos.elbuensabor.repositorios;

import com.magiestos.elbuensabor.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Long> {
}
