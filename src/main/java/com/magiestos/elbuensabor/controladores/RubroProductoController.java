package com.magiestos.elbuensabor.controladores;

import com.magiestos.elbuensabor.entidades.RubroProducto;
import com.magiestos.elbuensabor.servicios.RubroProductoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/rubroProducto")
public class RubroProductoController extends BaseControllerImpl<RubroProducto, RubroProductoServiceImpl> {

    @PostMapping("/nuevo")
    public ResponseEntity<?> nuevoRubroProducto(@RequestBody RubroProducto rubroProducto){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.nuevoRubroProducto(rubroProducto));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<?> updateRubroProducto(@PathVariable Long id,@RequestBody RubroProducto rubroProducto){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.updateRubroProducto(id,rubroProducto));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}
