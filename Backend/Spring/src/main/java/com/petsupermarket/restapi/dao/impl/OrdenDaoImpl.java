package com.petsupermarket.restapi.dao.impl;

import com.petsupermarket.restapi.dao.OrdenDao;
import com.petsupermarket.restapi.models.Orden;
import com.petsupermarket.restapi.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class OrdenDaoImpl implements OrdenDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void createOrden(Orden orden) {
        entityManager.persist(orden);
    }

    @Override
    public Orden getOrdenActiveByUser(Usuario usuario) {
        List<Orden> listOrden = entityManager.createQuery("From Orden WHERE usuario=:usuario AND estaPagado=false")
                .setParameter("usuario", usuario).getResultList();
        if(listOrden.isEmpty()) throw new IllegalArgumentException("There is no ORDEN");
        return listOrden.get(0);
    }

    @Override
    public void updateOrden(Orden orden) {
        entityManager.merge(orden);
    }
}
