package com.petsupermarket.restapi.dao.impl;

import com.petsupermarket.restapi.dao.AnimalDao;
import com.petsupermarket.restapi.models.Animal;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class AnimalDaoImpl implements AnimalDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void createAnimal(Animal animal) {
        entityManager.persist(animal);
    }
}