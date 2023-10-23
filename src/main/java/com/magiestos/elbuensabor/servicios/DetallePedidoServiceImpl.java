package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.DetallePedido;
import com.magiestos.elbuensabor.repositorios.BaseRepository;
import com.magiestos.elbuensabor.repositorios.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallePedidoServiceImpl extends BaseServiceImpl<DetallePedido,Long> implements DetallePedidoService {
    @Autowired
    protected DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoServiceImpl(BaseRepository<DetallePedido, Long> baseRepository, DetallePedidoRepository detallePedidoRepository) {
        super(baseRepository);
        this.detallePedidoRepository = detallePedidoRepository;
    }
}
