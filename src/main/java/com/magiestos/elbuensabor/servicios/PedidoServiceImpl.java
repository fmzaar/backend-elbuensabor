package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.Pedido;
import com.magiestos.elbuensabor.repositorios.BaseRepository;
import com.magiestos.elbuensabor.repositorios.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido,Long> implements PedidoService {
    @Autowired
    protected PedidoRepository pedidoRepository;

    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository, PedidoRepository pedidoRepository) {
        super(baseRepository);
        this.pedidoRepository = pedidoRepository;
    }
}
