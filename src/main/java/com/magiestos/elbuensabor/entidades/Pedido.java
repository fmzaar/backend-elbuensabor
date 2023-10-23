package com.magiestos.elbuensabor.entidades;

import com.magiestos.elbuensabor.enums.EstadoPedido;
import com.magiestos.elbuensabor.enums.FormaPago;
import com.magiestos.elbuensabor.enums.TipoEnvio;
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


    @Enumerated(EnumType.STRING)
    private EstadoPedido estadoPedido;
    @Enumerated(EnumType.STRING)
    private TipoEnvio tipoEnvio;
    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaEstimadaEntrega;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    private Double total;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_pedido")
    @Builder.Default
    private List<DetallePedido> detallePedidos = new ArrayList<>();

    public void addDetallePedido(DetallePedido detallePedido){
        this.detallePedidos.add(detallePedido);
    }

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturas = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fk_domicilio_pedido")
    private Domicilio domicilioPedido;
}
