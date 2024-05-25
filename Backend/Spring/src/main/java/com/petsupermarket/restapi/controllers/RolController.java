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

    @PostMapping
    public ResponseEntity<HttpStatus> createRol(@RequestBody Rol rol){
        try{
            rolService.createRol(rol);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}