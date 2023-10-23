package com.magiestos.elbuensabor.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetalleFactura extends BaseEntidad {
    private int cantidadDetalleFactura;
    @Column(precision = 10, scale = 2)
    private BigDecimal subtotal;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fk_articulo")
    private Producto producto;


}
