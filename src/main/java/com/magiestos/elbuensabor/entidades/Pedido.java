package com.magiestos.elbuensabor.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido extends BaseEntidad{

    //estado y tipoEnvio pueden ser clases apartes?
    private String fecha;
    private String estado;
    private long horaEstimadaEntrega; //LONG temporal, deberia ser date
    private String TipoEnvio;
    private Double total;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_pedido")
    @Builder.Default
    private List<DetallePedido> detallePedidos = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_factura", nullable = true)
    private Factura factura;

}
