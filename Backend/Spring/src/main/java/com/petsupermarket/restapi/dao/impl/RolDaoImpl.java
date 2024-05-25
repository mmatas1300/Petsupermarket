package com.petsupermarket.restapi.dao.impl;

import com.petsupermarket.restapi.dao.RolDao;
import com.petsupermarket.restapi.models.Rol;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class RolDaoImpl implements RolDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void createRol(Rol rol) {
        entityManager.createNativeQuery("INSERT INTO roles (nombre, descripcion) VALUES (?,?)")
                .setParameter(1, rol.getNombre())
                .setParameter(2, rol.getDescripcion()).executeUpdate();
    }
}