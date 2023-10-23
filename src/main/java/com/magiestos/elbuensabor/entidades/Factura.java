package com.magiestos.elbuensabor.entidades;

import com.magiestos.elbuensabor.enums.EstadoFactura;
import com.magiestos.elbuensabor.enums.FormaPago;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Factura extends BaseEntidad{

    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha; //Deberia ser DATE, cambiar
    @Enumerated(EnumType.STRING)
    private EstadoFactura estadoFactura;
    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;
    private float total;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleFactura> detalleFacturaList = new ArrayList<>();

    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    public void setTotal(float total){
        this.total= total;
    }
    public void addDetalleFactura(DetalleFactura detalleFactura){
        this.detalleFacturaList.add(detalleFactura);
    }
}
