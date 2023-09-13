package com.magiestos.elbuensabor.entidades;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Factura extends BaseEntidad{

    private long fecha; //Deberia ser DATE, cambiar
    private int numero;
    private double descuento;
    private String formaPago; //CHEQUEAR SI NO ES CLASE NUEVA
    private double total;


}
