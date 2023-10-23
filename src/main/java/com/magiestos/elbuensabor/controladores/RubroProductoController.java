package com.magiestos.elbuensabor.controladores;

import com.magiestos.elbuensabor.entidades.RubroProducto;
import com.magiestos.elbuensabor.servicios.RubroProductoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/rubroProducto")
public class RubroProductoController extends BaseControllerImpl<RubroProducto, RubroProductoServiceImpl> {
}
