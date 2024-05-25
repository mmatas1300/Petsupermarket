package com.petsupermarket.restapi.service;

import com.petsupermarket.restapi.dao.AnimalDao;
import com.petsupermarket.restapi.models.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    @Autowired
    AnimalDao animalDao;

    public void createAnimal(Animal animal){
        animalDao.createAnimal(animal);
    }
}