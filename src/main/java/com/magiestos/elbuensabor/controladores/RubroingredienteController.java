package com.magiestos.elbuensabor.controladores;

import com.magiestos.elbuensabor.entidades.RubroIngrediente;
import com.magiestos.elbuensabor.entidades.RubroProducto;
import com.magiestos.elbuensabor.servicios.RubroIngredienteServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/rubroIngrediente")
public class RubroingredienteController extends BaseControllerImpl<RubroIngrediente, RubroIngredienteServiceImpl> {

    @PostMapping("/nuevo")
    public ResponseEntity<?> nuevoRubroIngrediente(@RequestBody RubroIngrediente rubroIngrediente){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.nuevoRubroIngrediente(rubroIngrediente));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<?> updateRubroIngrediente(@PathVariable Long id,@RequestBody RubroIngrediente rubroIngrediente ){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.updateRubroIngrediente(id,rubroIngrediente));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
