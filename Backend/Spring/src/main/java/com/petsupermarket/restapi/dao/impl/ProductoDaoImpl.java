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
    public void createProducto(Producto producto) {
        entityManager.persist(producto);
    }

    @Override
    public List<Producto> getAllProducto() {
        return entityManager.createQuery("From Producto").getResultList();
    }

    @Override
    public List<Producto> getDiscountProducto() {
        return entityManager.createQuery("From Producto WHERE descuento>0").getResultList();
    }

    @Override
    public List<Producto> getExistingProducto() {
        return entityManager.createQuery("From Producto WHERE existencia>0").getResultList();
    }

    @Override
    public Producto getProducto(Long productoId) {
        return entityManager.find(Producto.class, productoId);
    }

    @Override
    public void updateProducto(Producto producto) {
        entityManager.merge(producto);
    }
}