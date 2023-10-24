package com.magiestos.elbuensabor.controladores;

import com.magiestos.elbuensabor.entidades.Producto;
import com.magiestos.elbuensabor.servicios.ProductoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/producto")
public class ProductoController extends BaseControllerImpl<Producto, ProductoServiceImpl> {

    @GetMapping("/buscarDenominaccion")
    public ResponseEntity<?> buscarDenominacion(@RequestParam String filter){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.buscarDenominacion(filter));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
    @GetMapping("/buscarCategoria")
    public ResponseEntity<?> buscarCategoria(@RequestParam String categoria){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.buscarDenominacion(categoria));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
