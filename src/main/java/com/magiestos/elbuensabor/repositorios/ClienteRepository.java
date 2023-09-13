package com.magiestos.elbuensabor.repositorios;

import com.magiestos.elbuensabor.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {
}
