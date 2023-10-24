package com.magiestos.elbuensabor.repositorios;

import com.magiestos.elbuensabor.entidades.RubroProducto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RubroProductoRepository extends BaseRepository<RubroProducto,Long> {
    @Query(value="SELECT * FROM rubro_producto WHERE rubro_producto.denominacion = :rubro",nativeQuery = true)
    List<RubroProducto> verifyRubroProducto(@Param("rubro")String denominacion);
}
