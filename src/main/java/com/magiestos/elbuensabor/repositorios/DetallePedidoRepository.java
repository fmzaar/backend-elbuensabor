package com.magiestos.elbuensabor.repositorios;

import com.magiestos.elbuensabor.entidades.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoRepository extends JpaRepository <DetallePedido, Long> {
}
