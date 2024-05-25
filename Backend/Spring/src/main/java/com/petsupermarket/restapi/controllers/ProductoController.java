package com.petsupermarket.restapi.controllers;

import com.petsupermarket.restapi.models.Producto;
import com.petsupermarket.restapi.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @PostMapping
    public ResponseEntity<String> createProducto(@RequestBody Producto producto){
        try{
            productoService.createProducto(producto);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public List<Producto> getAllProduct(){
        return productoService.getAllProducto();
    }

    @GetMapping("/discount")
    public List<Producto> getDiscountProduct(){
        return productoService.getDiscountProducto();
    }

    @GetMapping("/existing")
    public List<Producto> getExistingProduct(){
        return productoService.getExistingProducto();
    }

    @GetMapping("{id}")
    public Producto getProduct(@PathVariable("id") Long id){
        return productoService.getProducto(id);
    }

    @PutMapping
    public void updateProduct(@RequestBody Producto producto){
        productoService.updateProducto(producto);
    }
}