package com.magiestos.elbuensabor.repositorios;

import com.magiestos.elbuensabor.entidades.Producto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends BaseRepository<Producto,Long> {
}
