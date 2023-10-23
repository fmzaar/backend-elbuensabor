package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.Usuario;
import org.springframework.web.bind.annotation.PostMapping;

public interface UsuarioService extends BaseService<Usuario,Long> {

    public Usuario registerUser(Usuario usuario) throws Exception;
    public Usuario logIn(String email, String password) throws Exception;
}
