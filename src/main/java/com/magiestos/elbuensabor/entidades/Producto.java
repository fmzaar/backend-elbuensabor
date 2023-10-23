package com.magiestos.elbuensabor.entidades;

import com.magiestos.elbuensabor.enums.TipoProducto;
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
public class Producto extends BaseEntidad{

    @Enumerated(EnumType.STRING)
    private TipoProducto tipoProducto;
    @Column(nullable = false)
    private String denominacion;
    @Column(length = 1000)
    private String descripcion;
    private double precioVenta;
    private double precioCompra;
    private int stockActual;
    private int stockMinimo;
    @Column(length = 300)
    private String urlFoto;
    private int TiempoEstimadoCocina;

    @ManyToOne(cascade = CascadeType.REFRESH)
    private Rubro rubro;


}
