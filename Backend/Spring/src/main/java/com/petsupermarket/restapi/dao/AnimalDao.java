package com.petsupermarket.restapi.dao;

import com.petsupermarket.restapi.models.Animal;

import java.util.List;

public interface AnimalDao {
    void createAnimal(Animal animal);
    List<Animal> readAllAnimal();
    void updateAnimal(Animal animal);
    void deleteAnimal(Long animalId);
}