package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.RubroIngrediente;
import com.magiestos.elbuensabor.repositorios.BaseRepository;
import com.magiestos.elbuensabor.repositorios.RubroIngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RubroIngredienteServiceImpl extends BaseServiceImpl<RubroIngrediente,Long> implements RubroIngredienteService {
    @Autowired
    protected RubroIngredienteRepository rubroIngredienteRepository;

    public RubroIngredienteServiceImpl(BaseRepository<RubroIngrediente, Long> baseRepository, RubroIngredienteRepository rubroIngredienteRepository) {
        super(baseRepository);
        this.rubroIngredienteRepository = rubroIngredienteRepository;
    }
}
