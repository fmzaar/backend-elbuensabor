package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.Ingrediente;
import com.magiestos.elbuensabor.repositorios.BaseRepository;
import com.magiestos.elbuensabor.repositorios.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class IngredienteServiceImpl extends BaseServiceImpl<Ingrediente,Long> implements IngredienteService {
    @Autowired
    protected IngredienteRepository ingredienteRepository;

    public IngredienteServiceImpl(BaseRepository<Ingrediente, Long> baseRepository, IngredienteRepository ingredienteRepository) {
        super(baseRepository);
        this.ingredienteRepository = ingredienteRepository;
    }

    @Override
    public Ingrediente nuevoIngrediente(Ingrediente ingrediente) throws Exception {
        try{
            List<Ingrediente> ingredienteList = ingredienteRepository.verifyIngrediente(ingrediente.getDenominacion());
            if(ingredienteList.isEmpty()){
                ingredienteRepository.save(ingrediente);
                return ingrediente;
            }else {
                throw new Exception("Ya existe el ingrediente");
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public Ingrediente updateIngrediente(Long id, Ingrediente updateI) throws Exception{
        try{
            Optional<Ingrediente> ingredienteOptional = ingredienteRepository.findById(id);
            if(ingredienteOptional.isPresent()){
                Ingrediente ingrediente = ingredienteOptional.get();
                if (updateI.getDenominacion() != null){
                    ingrediente.setDenominacion(updateI.getDenominacion());
                    ingrediente.setFechaModificacion(new Date());
                }
                ingredienteRepository.save(ingrediente);
                return ingrediente;
            }else{
                throw new Exception("Ingrediente no disponible");
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public List<Ingrediente> stockBajos() throws Exception{
        try{
            List<Ingrediente> ingredienteList = ingredienteRepository.stockBajos();
            return ingredienteList;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
