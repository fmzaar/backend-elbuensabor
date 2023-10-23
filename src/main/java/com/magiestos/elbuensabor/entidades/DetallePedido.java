package com.magiestos.elbuensabor.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetallePedido extends BaseEntidad {
    private int cantidad;
    private double subtotal;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_articulo_producto")
    private Producto producto;

}
