package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.Ingrediente;
import com.magiestos.elbuensabor.repositorios.BaseRepository;
import com.magiestos.elbuensabor.repositorios.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredienteServiceImpl extends BaseServiceImpl<Ingrediente,Long> implements IngredienteService {
    @Autowired
    protected IngredienteRepository ingredienteRepository;

    public IngredienteServiceImpl(BaseRepository<Ingrediente, Long> baseRepository, IngredienteRepository ingredienteRepository) {
        super(baseRepository);
        this.ingredienteRepository = ingredienteRepository;
    }
}
