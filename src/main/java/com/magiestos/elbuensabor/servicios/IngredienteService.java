package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.Ingrediente;

import java.util.List;

public interface IngredienteService extends BaseService<Ingrediente,Long> {
    public Ingrediente nuevoIngrediente(Ingrediente ingrediente) throws Exception;
    public Ingrediente updateIngrediente(Long id, Ingrediente UpdateI) throws Exception;
    public List<Ingrediente> stockBajos() throws Exception;
}
