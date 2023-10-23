package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.Usuario;
import com.magiestos.elbuensabor.repositorios.BaseRepository;
import com.magiestos.elbuensabor.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario,Long> implements UsuarioService {
    @Autowired
    protected UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository, UsuarioRepository usuarioRepository) {
        super(baseRepository);
        this.usuarioRepository = usuarioRepository;
    }
}
