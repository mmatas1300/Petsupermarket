package com.petsupermarket.restapi.controllers;

import com.petsupermarket.restapi.dao.RolDao;
import com.petsupermarket.restapi.models.Rol;
import com.petsupermarket.restapi.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/roles")
public class RolController {
    
    @Autowired
    RolService rolService;

    @GetMapping
    public List<Rol> getRoles(){
        return rolService.readAllRol();
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createRol(@RequestBody Rol rol){
        rolService.createRol(rol);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> updateRol(@RequestBody Rol rol){
        rolService.updateRol(rol);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteRol(@RequestBody Rol rol){
        rolService.deleteRol(rol);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
