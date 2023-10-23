package com.magiestos.elbuensabor.repositorios;

import com.magiestos.elbuensabor.entidades.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}
