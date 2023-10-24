package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.RubroIngrediente;
import com.magiestos.elbuensabor.entidades.RubroProducto;
import com.magiestos.elbuensabor.repositorios.BaseRepository;
import com.magiestos.elbuensabor.repositorios.RubroProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class RubroProductoServiceImpl extends BaseServiceImpl<RubroProducto,Long> implements RubroProductoService {
    @Autowired
    protected RubroProductoRepository rubroProductoRepository;

    public RubroProductoServiceImpl(BaseRepository<RubroProducto, Long> baseRepository, RubroProductoRepository rubroProductoRepository) {
        super(baseRepository);
        this.rubroProductoRepository = rubroProductoRepository;
    }
    @Override
    public RubroProducto nuevoRubroProducto(RubroProducto rubroProducto) throws Exception{
        try{
            List<RubroProducto> rubroProductoList = rubroProductoRepository.verifyRubroProducto(rubroProducto.getDenominacion());
            if (rubroProductoList.isEmpty()){
                rubroProductoRepository.save(rubroProducto);
                return rubroProducto;
            }else {
                throw new Exception("Rubro ya existente");
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public RubroProducto updateRubroProducto(Long id, RubroProducto updateRP) throws Exception{
        try{
            Optional<RubroProducto> rubroProductoOptional = rubroProductoRepository.findById(id);
            if(rubroProductoOptional.isPresent()){
                RubroProducto rubroProducto = rubroProductoOptional.get();
                if (updateRP.getDenominacion() != null){
                    rubroProducto.setDenominacion(updateRP.getDenominacion());
                    rubroProducto.setFechaModificacion(new Date());
                }
                rubroProductoRepository.save(rubroProducto);
                return  rubroProducto;
            }else {
                throw new Exception("Rubro no disponible");
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
