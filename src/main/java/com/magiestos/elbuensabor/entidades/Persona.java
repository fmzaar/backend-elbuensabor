package com.magiestos.elbuensabor.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Persona extends BaseEntidad{
    private String nombre;
    private String apellido;
    private String telefono;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;

}
