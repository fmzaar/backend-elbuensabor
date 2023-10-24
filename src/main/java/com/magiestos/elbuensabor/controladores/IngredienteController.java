package com.magiestos.elbuensabor.controladores;

import com.magiestos.elbuensabor.entidades.Ingrediente;
import com.magiestos.elbuensabor.servicios.IngredienteServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/ingrediente")
public class IngredienteController extends BaseControllerImpl<Ingrediente, IngredienteServiceImpl> {
    @PostMapping("/nuevoIngrediente")
    public ResponseEntity<?> nuevoIngrediente(@RequestBody Ingrediente ingrediente){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.nuevoIngrediente(ingrediente));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
    @PostMapping("/updateIngrediente")
    public ResponseEntity<?> updateIngrediente(@PathVariable Long id,@RequestBody Ingrediente ingrediente){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.updateIngrediente(id,ingrediente));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
    @GetMapping("/StocksBajos")
    public ResponseEntity<?> stockBajos(String denominacion){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.stockBajos());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


}
