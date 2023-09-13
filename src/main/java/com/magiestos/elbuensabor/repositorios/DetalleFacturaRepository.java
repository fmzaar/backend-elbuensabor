package com.magiestos.elbuensabor.repositorios;

import com.magiestos.elbuensabor.entidades.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, Long> {
}
