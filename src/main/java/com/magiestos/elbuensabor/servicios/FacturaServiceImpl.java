package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.Factura;
import com.magiestos.elbuensabor.repositorios.BaseRepository;
import com.magiestos.elbuensabor.repositorios.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura,Long> implements FacturaService {
    @Autowired
    protected FacturaRepository facturaRepository;

    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository, FacturaRepository facturaRepository) {
        super(baseRepository);
        this.facturaRepository = facturaRepository;
    }
}
