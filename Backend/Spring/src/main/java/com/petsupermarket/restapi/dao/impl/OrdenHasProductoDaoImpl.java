package com.petsupermarket.restapi.dao.impl;

import com.petsupermarket.restapi.dao.OrdenHasProductoDao;
import com.petsupermarket.restapi.models.Orden;
import com.petsupermarket.restapi.models.OrdenHasProducto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class OrdenHasProductoDaoImpl implements OrdenHasProductoDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void createOrdenHasProducto(OrdenHasProducto ordenHasProducto) {
        entityManager.persist(ordenHasProducto);
    }

    @Override
    public List<OrdenHasProducto> getOrdenHasProductoByOrden(Orden orden) {
        return entityManager.createQuery("From OrdenHasProducto WHERE orden =:orden")
                .setParameter("orden", orden)
                .getResultList();
    }

    @Override
    public void deleteOrdenHasProducto(OrdenHasProducto ordenHasProducto) {
        OrdenHasProducto ordenHasProductoFound = entityManager.find(OrdenHasProducto.class, ordenHasProducto.getId());
        entityManager.remove(ordenHasProductoFound);
    }

    @Override
    public void updateOrdenHasProducto(OrdenHasProducto ordenHasProducto){
        OrdenHasProducto ordenHasProductoFound = entityManager.find(OrdenHasProducto.class, ordenHasProducto.getId());
        ordenHasProductoFound.setCantidad(ordenHasProducto.getCantidad());
        entityManager.merge(ordenHasProductoFound);
    }
}