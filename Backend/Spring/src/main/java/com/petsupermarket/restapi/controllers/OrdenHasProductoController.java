package com.petsupermarket.restapi.controllers;

import com.petsupermarket.restapi.models.OrdenHasProducto;
import com.petsupermarket.restapi.service.OrdenHasProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/OHP")
public class OrdenHasProductoController {

    @Autowired
    OrdenHasProductoService ordenHasProductoService;

    @PostMapping("{productoId}")
    public ResponseEntity<HttpStatus> createOrdenHasProducto(@RequestBody OrdenHasProducto ordenHasProducto, @RequestHeader(name = "Authorization") String token, @PathVariable("productoId") Long productoId){
        ordenHasProductoService.createOrdenHasProducto(ordenHasProducto,productoId,token);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}