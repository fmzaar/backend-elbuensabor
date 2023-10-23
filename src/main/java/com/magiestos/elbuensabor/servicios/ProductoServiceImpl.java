package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.Producto;
import com.magiestos.elbuensabor.repositorios.BaseRepository;
import com.magiestos.elbuensabor.repositorios.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto,Long> implements ProductoService {
    @Autowired
    protected ProductoRepository productoRepository;

    public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository, ProductoRepository productoRepository) {
        super(baseRepository);
        this.productoRepository = productoRepository;
    }
}
