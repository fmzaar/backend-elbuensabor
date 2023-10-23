package com.magiestos.elbuensabor.entidades;

import com.magiestos.elbuensabor.enums.Rol;
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

    private String password;
    private String email;

    @OneToOne
    @JoinColumn(name="fk_domicilio")
    private Domicilio domicilio;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    //@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @OneToMany(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fk_pedido")
    @Builder.Default
    private List<Pedido> pedidos = new ArrayList<>();

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fk_persona")
    public Persona persona;
}
