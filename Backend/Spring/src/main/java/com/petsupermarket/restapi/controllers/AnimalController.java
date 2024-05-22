package com.petsupermarket.restapi.controllers;

import com.petsupermarket.restapi.models.Animal;
import com.petsupermarket.restapi.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/animales")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @GetMapping
    public List<Animal> readAllAnimal(){
        return animalService.readAllAnimal();
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createAnimal(@RequestBody Animal animal){
        animalService.createAnimal(animal);
        return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> updateAnimal(@RequestBody Animal animal){
        animalService.updateAnimal(animal);
        return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteAnimal(@RequestBody Animal animal){
        animalService.deleteAnimal(animal);
        return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
    }
}
