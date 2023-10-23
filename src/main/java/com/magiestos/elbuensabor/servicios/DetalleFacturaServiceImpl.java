package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.DetalleFactura;
import com.magiestos.elbuensabor.repositorios.BaseRepository;
import com.magiestos.elbuensabor.repositorios.DetalleFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleFacturaServiceImpl extends BaseServiceImpl<DetalleFactura,Long> implements DetalleFacturaService{
    @Autowired
    protected DetalleFacturaRepository detalleFacturaRepository;

    public DetalleFacturaServiceImpl(BaseRepository<DetalleFactura,Long> baseRepository, DetalleFacturaRepository detalleFacturaRepository){
        super(baseRepository);
        this.detalleFacturaRepository = detalleFacturaRepository;
    }
}
