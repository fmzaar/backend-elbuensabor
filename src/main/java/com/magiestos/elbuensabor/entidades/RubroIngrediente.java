package com.magiestos.elbuensabor.entidades;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RubroIngrediente extends BaseEntidad{
    private String denominacion;
}
