package com.magiestos.elbuensabor.repositorios;

import com.magiestos.elbuensabor.entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroRepository extends JpaRepository <Rubro, Long> {
}
