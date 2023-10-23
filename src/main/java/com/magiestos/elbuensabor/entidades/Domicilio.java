package com.magiestos.elbuensabor.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Domicilio extends BaseEntidad{

    private String calle;
    private int numeroCalle;
    private String localidad;
    private int codPostal;
    private int pisoDepto;
    private int nroDepto;


    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fk_persona")
    private Persona persona;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;


}
