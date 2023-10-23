package com.magiestos.elbuensabor.controladores;

import com.magiestos.elbuensabor.entidades.DetallePedido;
import com.magiestos.elbuensabor.servicios.DetallePedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/detallePedido")
public class detallePedidoController extends BaseControllerImpl<DetallePedido, DetallePedidoServiceImpl> {
}
