package com.magiestos.elbuensabor.entidades;

import com.magiestos.elbuensabor.enums.Rol;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuario")
@Builder
public class Usuario extends BaseEntidad{

    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;

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
