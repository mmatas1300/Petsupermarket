package com.petsupermarket.restapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    @Column(name = "descripcion", nullable = false, length = 200)
    private String descripcion;
    @Column(name = "contenido", nullable = false, length = 45)
    private String contenido;
    @Column(name = "precio", nullable = false)
    private Float precio;
    @Column(name = "descuento", nullable = false)
    private int descuento;
    @Column(name = "existencia", nullable = false)
    private Long existencia;
    @Column(name = "imagen", nullable = false, length = 500)
    private String imagen;
    @Column(name = "marca", nullable = false, length = 45)
    private String marca;

    @ManyToOne
    @JoinColumn(name = "animal_id", nullable = false)
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;
}