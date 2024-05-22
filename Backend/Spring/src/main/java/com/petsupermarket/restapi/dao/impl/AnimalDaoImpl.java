package com.petsupermarket.restapi.dao.impl;

import com.petsupermarket.restapi.dao.AnimalDao;
import com.petsupermarket.restapi.models.Animal;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class AnimalDaoImpl implements AnimalDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void createAnimal(Animal animal) {
        entityManager.persist(animal);
    }

    @Override
    public List<Animal> readAllAnimal() {
        return entityManager.createQuery("From Animal").getResultList();
    }

    @Override
    public void updateAnimal(Animal animal) {
        entityManager.merge(animal);
    }

    @Override
    public void deleteAnimal(Long animalId) {
        Animal animalFound = entityManager.find(Animal.class, animalId);
        entityManager.remove(animalFound);
    }
}