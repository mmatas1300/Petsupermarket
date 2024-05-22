package com.petsupermarket.restapi.dao;

import com.petsupermarket.restapi.models.Categoria;

import java.util.List;

public interface CategoriaDao {
    List<Categoria> readAllCategoria();
}
