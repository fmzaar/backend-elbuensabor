package com.magiestos.elbuensabor.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "cliente") //Solo necesario si queremos cambiar el nombre de la tabla
public class Cliente extends BaseEntidad {

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_cliente")
    @Builder.Default
    private List<Pedido> pedidos = new ArrayList<>();

    public void agregarPedido(Pedido pedi){
        pedidos.add(pedi);
    }
    public void mostrarPedidos(){
        System.out.println("Pedidos de " + nombre + " "+ apellido + ": ");
        for (Pedido pedido : pedidos){
            System.out.println("Fecha: " + pedido.getFecha()+ ", Estado: " + pedido.getEstado()+ ", Hora estimada de Entrega: " + pedido.getHoraEstimadaEntrega()+", Tipo de envio: " + pedido.getTipoEnvio()+", Costo total: "+ pedido.getTotal());
        }
    }
}
