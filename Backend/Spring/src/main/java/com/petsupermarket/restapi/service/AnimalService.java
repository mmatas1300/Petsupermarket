package com.petsupermarket.restapi.service;

import com.petsupermarket.restapi.dao.AnimalDao;
import com.petsupermarket.restapi.models.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    AnimalDao animalDao;

    public List<Animal> readAllAnimal(){
        return animalDao.readAllAnimal();
    }

    public void createAnimal(Animal animal){
        animalDao.createAnimal(animal);
    }

    public void updateAnimal(Animal animal){
        animalDao.updateAnimal(animal);
    }

    public void deleteAnimal(Animal animal){
        animalDao.deleteAnimal(animal.getId());
    }
}
