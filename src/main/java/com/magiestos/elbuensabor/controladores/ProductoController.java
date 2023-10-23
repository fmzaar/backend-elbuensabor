package com.magiestos.elbuensabor.controladores;

import com.magiestos.elbuensabor.entidades.Producto;
import com.magiestos.elbuensabor.servicios.ProductoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/producto")
public class ProductoController extends BaseControllerImpl<Producto, ProductoServiceImpl> {
}
