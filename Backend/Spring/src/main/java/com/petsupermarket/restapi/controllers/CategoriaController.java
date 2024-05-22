package com.petsupermarket.restapi.controllers;

import com.petsupermarket.restapi.models.Categoria;
import com.petsupermarket.restapi.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/categorias")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> readAllCategoria(){
        return categoriaService.readAllCategoria();
    }
}