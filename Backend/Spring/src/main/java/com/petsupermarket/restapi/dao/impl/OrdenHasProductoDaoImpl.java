package com.petsupermarket.restapi.dao.impl;

import com.petsupermarket.restapi.dao.OrdenHasProductoDao;
import com.petsupermarket.restapi.models.OrdenHasProducto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class OrdenHasProductoDaoImpl implements OrdenHasProductoDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void createOrdenHasProducto(OrdenHasProducto ordenHasProducto) {
        entityManager.persist(ordenHasProducto);
    }
}
