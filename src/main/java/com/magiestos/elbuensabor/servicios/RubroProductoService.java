package com.magiestos.elbuensabor.servicios;


import com.magiestos.elbuensabor.entidades.RubroProducto;

public interface RubroProductoService extends BaseService<RubroProducto,Long> {
    public RubroProducto nuevoRubroProducto (RubroProducto rubroProducto) throws Exception;
    public RubroProducto updateRubroProducto (Long id, RubroProducto updateRP) throws  Exception;
}
