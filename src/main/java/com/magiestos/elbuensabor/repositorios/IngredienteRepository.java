package com.magiestos.elbuensabor.repositorios;

import com.magiestos.elbuensabor.entidades.Ingrediente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredienteRepository extends BaseRepository<Ingrediente,Long> {
    @Query(value = "SELECT * FROM ingrediente WHERE ingrediente.dennominacion = :denominacion", nativeQuery = true)
    List<Ingrediente> verifyIngrediente(@Param("denominacion")String denominacion);

    @Query(value = "SELECT * FROM ingrediente WHERE (stock_actual < stock_minimo) OR (stock_actual <=(stock_minimo*1.2))", nativeQuery = true)
    List<Ingrediente> stockBajos();
}
