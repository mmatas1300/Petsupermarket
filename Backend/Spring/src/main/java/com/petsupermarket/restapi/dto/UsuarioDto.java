package com.petsupermarket.restapi.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter
@Component
public class UsuarioDto {
    private String nombre;
    private String direccion;
    private String telefono;
    private String ciudad;
    private String cp;
}