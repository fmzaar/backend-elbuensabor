package com.magiestos.elbuensabor.entidades;

import com.magiestos.elbuensabor.enums.UnidadMedida;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.engine.internal.Cascade;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ingrediente extends BaseEntidad{

    @NotNull
    private String denominacion;
    private double precioCompra;
    private int stockAcual;
    private int StockMinimo;
    @Column(length = 300)
    private String urlFoto;
    @Enumerated(EnumType.STRING)
    private UnidadMedida unidadMedida;


    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fk_rubro_ingrediente")
    private RubroIngrediente rubroIngrediente;
}
