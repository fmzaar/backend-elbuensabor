package com.magiestos.elbuensabor.entidades;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetalleFactura extends BaseEntidad {
    private int cantidadDetalleFactura;

    //Mapear a factura
}