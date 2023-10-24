package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.RubroIngrediente;
import com.magiestos.elbuensabor.repositorios.BaseRepository;
import com.magiestos.elbuensabor.repositorios.RubroIngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class RubroIngredienteServiceImpl extends BaseServiceImpl<RubroIngrediente,Long> implements RubroIngredienteService {
    @Autowired
    protected RubroIngredienteRepository rubroIngredienteRepository;

    public RubroIngredienteServiceImpl(BaseRepository<RubroIngrediente, Long> baseRepository, RubroIngredienteRepository rubroIngredienteRepository) {
        super(baseRepository);
        this.rubroIngredienteRepository = rubroIngredienteRepository;
    }
    @Override
    public RubroIngrediente nuevoRubroIngrediente(RubroIngrediente rubroIngrediente) throws Exception{
        try{
            List<RubroIngrediente> rubroIngredienteList = rubroIngredienteRepository.verifyRubroIngrediente(rubroIngrediente.getDenominacion());
            if (rubroIngredienteList.isEmpty()){
                rubroIngredienteRepository.save(rubroIngrediente);
                return rubroIngrediente;
            }else {
                throw new Exception("Rubro ya existente");
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public RubroIngrediente updateRubroIngrediente(Long id, RubroIngrediente updateRI) throws Exception{
        try{
            Optional<RubroIngrediente> rubroIngredienteOptional = rubroIngredienteRepository.findById(id);
            if(rubroIngredienteOptional.isPresent()){
                RubroIngrediente rubroIngrediente = rubroIngredienteOptional.get();
                if (updateRI.getDenominacion() != null){
                    rubroIngrediente.setDenominacion(updateRI.getDenominacion());
                    rubroIngrediente.setFechaModificacion(new Date());
                }
                rubroIngredienteRepository.save(rubroIngrediente);
                return  rubroIngrediente;
            }else {
                throw new Exception("Rubro no disponible");
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
