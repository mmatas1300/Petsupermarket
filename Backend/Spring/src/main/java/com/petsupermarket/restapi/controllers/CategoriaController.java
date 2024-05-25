package com.petsupermarket.restapi.controllers;

import com.petsupermarket.restapi.models.Categoria;
import com.petsupermarket.restapi.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<String> createCategoria(@RequestBody Categoria categoria){
        categoriaService.createCategoria(categoria);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}