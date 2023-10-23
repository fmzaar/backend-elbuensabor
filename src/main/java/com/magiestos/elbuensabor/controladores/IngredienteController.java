package com.magiestos.elbuensabor.controladores;

import com.magiestos.elbuensabor.entidades.Ingrediente;
import com.magiestos.elbuensabor.servicios.IngredienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/ingrediente")
public class IngredienteController extends BaseControllerImpl<Ingrediente, IngredienteServiceImpl> {
}
