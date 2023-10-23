package com.magiestos.elbuensabor.controladores;

import com.magiestos.elbuensabor.entidades.Usuario;
import com.magiestos.elbuensabor.servicios.UsuarioServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/usuario")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl> {

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody Usuario usuario){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.registerUser(usuario));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping("/login")
    public ResponseEntity<?> logIn(@RequestParam String email,@RequestParam String password){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.logIn(email,password));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
