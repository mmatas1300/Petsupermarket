package com.petsupermarket.restapi.controllers;

import com.petsupermarket.restapi.models.Orden;
import com.petsupermarket.restapi.service.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/ordenes")
public class OrdenController {

    @Autowired
    OrdenService ordenService;

    @PostMapping
    public ResponseEntity<HttpStatus> createOrden(@RequestBody Orden orden, @RequestHeader(name = "Authorization") String token) {
        ordenService.createOrden(orden, token);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<HttpStatus> updateOrden(@RequestBody Orden orden, @RequestHeader(name = "Authorization") String token) {
        ordenService.updateOrden(orden, token);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}