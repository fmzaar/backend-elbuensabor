package com.magiestos.elbuensabor.entidades;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class RubroProducto extends BaseEntidad{
    private String denominacion;
}
