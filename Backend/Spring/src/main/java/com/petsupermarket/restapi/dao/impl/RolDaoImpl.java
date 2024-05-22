package com.petsupermarket.restapi.dao.impl;

import com.petsupermarket.restapi.dao.RolDao;
import com.petsupermarket.restapi.models.Rol;
import com.petsupermarket.restapi.models.User;
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
    public List<Rol> getRoles() {
        String query = "FROM Rol";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Rol createRol(Rol rol) {
        return null;
    }

    @Override
    public Rol updateRol(Long rolId, Rol rol) {
        return null;
    }

    @Override
    public void deleteRol(Long rolId) {

    }
}
