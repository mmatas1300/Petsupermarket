package com.petsupermarket.restapi.dao.impl;

import com.petsupermarket.restapi.dao.CategoriaDao;
import com.petsupermarket.restapi.models.Categoria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class CategoriaDaoImpl implements CategoriaDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public void createCategoria(Categoria categoria) {
        entityManager.persist(categoria);
    }
}