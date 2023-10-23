package com.magiestos.elbuensabor.controladores;

import com.magiestos.elbuensabor.entidades.Factura;
import com.magiestos.elbuensabor.servicios.FacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/factura")
public class FacturaController extends BaseControllerImpl<Factura, FacturaServiceImpl> {
}
