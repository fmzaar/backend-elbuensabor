package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.RubroProducto;
import com.magiestos.elbuensabor.repositorios.BaseRepository;
import com.magiestos.elbuensabor.repositorios.RubroProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RubroProductoServiceImpl extends BaseServiceImpl<RubroProducto,Long> implements RubroProductoService {
    @Autowired
    protected RubroProductoRepository rubroProductoRepository;

    public RubroProductoServiceImpl(BaseRepository<RubroProducto, Long> baseRepository, RubroProductoRepository rubroProductoRepository) {
        super(baseRepository);
        this.rubroProductoRepository = rubroProductoRepository;
    }
}
