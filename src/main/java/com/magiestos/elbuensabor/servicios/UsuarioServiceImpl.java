package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.Usuario;
import com.magiestos.elbuensabor.enums.Rol;
import com.magiestos.elbuensabor.repositorios.BaseRepository;
import com.magiestos.elbuensabor.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario,Long> implements UsuarioService {
    @Autowired
    protected UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository, UsuarioRepository usuarioRepository) {
        super(baseRepository);
        this.usuarioRepository = usuarioRepository;
    }
    @Override
    public Usuario registerUser(Usuario usuario) throws Exception{
        try{
            List<Usuario> foundUser = usuarioRepository.verificarCorreo(usuario.getEmail());
            if(foundUser.isEmpty()){
                usuario.setRol(Rol.CLIENTE);
                usuarioRepository.save(usuario);
                return usuario;
            }
            else{
                throw new Exception("Ya se encuentra un usuario registrado con esta direccion de email.");
            }
        }
        catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public Usuario logIn(String email, String password) throws Exception{
        try{
            List<Usuario> userFound = usuarioRepository.logIn(email,password);
            if (userFound.isEmpty()){
                throw new Exception("El usuario y/o la contraseña ingresada es incorrecta. Intente nuevamente");
            }
            else{
                return userFound.get(0);
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
