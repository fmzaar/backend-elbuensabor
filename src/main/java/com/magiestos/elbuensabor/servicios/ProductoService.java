package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.Producto;

import java.util.List;

public interface ProductoService extends BaseService<Producto,Long> {

    public List<Producto> buscarDenominacion(String filter) throws Exception;
    public List<Producto> buscarCategoria(String categoria) throws Exception;
}
