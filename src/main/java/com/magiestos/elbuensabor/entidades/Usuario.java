package com.magiestos.elbuensabor.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario extends BaseEntidad{

    private String nombre;
    private String password;
    private String rol;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_usuario")
    @Builder.Default
    private List<Pedido> pedidos = new ArrayList<>();
}
