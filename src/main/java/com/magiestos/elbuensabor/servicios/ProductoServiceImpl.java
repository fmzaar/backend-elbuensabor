package com.magiestos.elbuensabor.servicios;

import com.magiestos.elbuensabor.entidades.Producto;
import com.magiestos.elbuensabor.repositorios.BaseRepository;
import com.magiestos.elbuensabor.repositorios.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto,Long> implements ProductoService {
    @Autowired
    protected ProductoRepository productoRepository;

    public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository, ProductoRepository productoRepository) {
        super(baseRepository);
        this.productoRepository = productoRepository;
    }

    public List<Producto> buscarDenominacion(String filter) throws Exception{
        try{
            List<Producto> productoList = productoRepository.buscarDenominacion(filter);
            if(productoList.isEmpty()){
                throw new Exception("N/A");
            }else {
                return productoList;
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public List<Producto> buscarCategoria(String categoria) throws Exception{
        try{
            List<Producto> categoriaproducto = new ArrayList<>();
            List<Producto> productoList = productoRepository.findAll();
            for (Producto producto:productoList){
                String categorias = producto.getRubroProducto().getDenominacion();
                if(Objects.equals(categoria,categorias)){
                    categoriaproducto.add(producto);
                }
            }
            return categoriaproducto;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
