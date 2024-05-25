package com.petsupermarket.restapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "comentarios")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha", nullable = false)
    private Timestamp fecha;
    @Column(name = "comentario", length = 100)
    private String comentario;
    @Column(name = "calificacion", nullable = false)
    private int calificacion;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    @JsonIgnoreProperties({"id","direccion","telefono","email","password","fechaNacimiento","ciudad","cp","rol"})
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    @JsonIgnoreProperties({"nombre","descripcion","contenido","precio","descuento","existencia","imagen","marca","animal","categoria"})
    private Producto producto;
}