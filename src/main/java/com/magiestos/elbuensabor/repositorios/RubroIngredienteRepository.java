package com.magiestos.elbuensabor.repositorios;
import com.magiestos.elbuensabor.entidades.RubroIngrediente;
import com.magiestos.elbuensabor.entidades.RubroProducto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RubroIngredienteRepository extends BaseRepository<RubroIngrediente, Long>{
    @Query(value="SELECT * FROM rubro_ingrediente WHERE rubro_ingrediente.denominacion = :rubro",nativeQuery = true)
    List<RubroIngrediente> verifyRubroIngrediente(@Param("rubro")String denominacion);
}
