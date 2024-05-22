package com.petsupermarket.restapi.service;

import com.petsupermarket.restapi.dao.CategoriaDao;
import com.petsupermarket.restapi.models.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    CategoriaDao categoriaDao;

    public List<Categoria> readAllCategoria(){
        return categoriaDao.readAllCategoria();
    }
}