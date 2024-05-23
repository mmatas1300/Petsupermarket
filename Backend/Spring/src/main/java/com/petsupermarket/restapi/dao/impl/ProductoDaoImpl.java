package com.petsupermarket.restapi.dao.impl;

import com.petsupermarket.restapi.dao.ProductoDao;
import com.petsupermarket.restapi.models.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class ProductoDaoImpl implements ProductoDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Producto> readAllProducto() {
        return entityManager.createQuery("From Producto").getResultList();
    }

    @Override
    public List<Producto> readAllDiscountProducto() {
        return entityManager.createQuery("From Producto WHERE descuento>0").getResultList();
    }

    @Override
    public Producto readProducto(Producto producto) {
        return entityManager.find(Producto.class, producto);
    }
}
