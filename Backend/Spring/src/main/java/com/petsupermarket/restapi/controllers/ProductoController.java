package com.petsupermarket.restapi.controllers;

import com.petsupermarket.restapi.models.Producto;
import com.petsupermarket.restapi.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping
    public List<Producto> readAllProduct(){
        return productoService.readAllProducto();
    }

    @GetMapping("/discount")
    public List<Producto> readAllDiscountProduct(){
        return productoService.readAllDiscountProducto();
    }

    @GetMapping("{id}")
    public Producto readProduct(@PathVariable("id") Long id){
        return productoService.readProducto(id);
    }
}