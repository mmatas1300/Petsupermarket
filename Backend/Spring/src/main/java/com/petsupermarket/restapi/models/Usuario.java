package com.petsupermarket.restapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 70)
    private String nombre;
    @Column(name = "direccion", nullable = false, length = 300)
    private String direccion;
    @Column(name = "telefono", nullable = false, length = 30)
    private String telefono;
    @Column(name = "email", nullable = false, length = 120)
    private String email;
    @Column(name = "password", nullable = false, length = 300)
    private String password;
    @Column(name = "fecha_nacimiento", nullable = false)
    private Timestamp fechaNacimiento;
    @Column(name = "ciudad", nullable = false, length = 45)
    private String ciudad;
    @Column(name = "cp", nullable = false, length = 10)
    private String cp;

    @ManyToOne
    @JoinColumn(name="rol_id", nullable=false)
    private Rol rol;
}




