package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.RubroIngrediente;

public interface RubroIngredienteService extends BaseService<RubroIngrediente,Long>{
    public RubroIngrediente nuevoRubroIngrediente (RubroIngrediente rubroIngrediente) throws Exception;
    public RubroIngrediente updateRubroIngrediente (Long id, RubroIngrediente updateRI) throws  Exception;
}
