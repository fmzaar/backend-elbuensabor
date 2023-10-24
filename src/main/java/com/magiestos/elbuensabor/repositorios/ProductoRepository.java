package com.magiestos.elbuensabor.repositorios;

import com.magiestos.elbuensabor.entidades.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends BaseRepository<Producto,Long> {
    @Query(value = "SELECT * FROM producto WHERE denominacion LIKE %:filter",nativeQuery = true)
    List<Producto> buscarDenominacion(@Param("filter") String filter);
}
