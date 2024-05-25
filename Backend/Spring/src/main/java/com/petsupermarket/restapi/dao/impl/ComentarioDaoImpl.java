package com.petsupermarket.restapi.dao.impl;

import com.petsupermarket.restapi.dao.ComentarioDao;
import com.petsupermarket.restapi.models.Comentario;
import com.petsupermarket.restapi.models.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public class ComentarioDaoImpl implements ComentarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void createComentario(Comentario comentario) {
        entityManager.persist(comentario);
    }

    @Override
    public List<Comentario> getComentarioByProducto(Producto producto) {
        return entityManager.createQuery("From Comentario WHERE producto =:producto")
                .setParameter("producto", producto).getResultList();
    }
}