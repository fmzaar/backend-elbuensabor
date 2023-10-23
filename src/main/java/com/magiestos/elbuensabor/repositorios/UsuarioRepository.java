package com.magiestos.elbuensabor.repositorios;

import com.magiestos.elbuensabor.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario,Long> {

    @Query(value = "SELECT * FROM usuario WHERE usuario.email = :correo",nativeQuery = true)
    List<Usuario> verificarCorreo(@Param("correo")String email);

    @Query(value = "SELECT * FROM usuario WHERE usuario.email = :correo AND usuario.password = :pass",nativeQuery = true)
    List<Usuario> logIn(@Param("correo")String email, @Param("pass")String password);

}
