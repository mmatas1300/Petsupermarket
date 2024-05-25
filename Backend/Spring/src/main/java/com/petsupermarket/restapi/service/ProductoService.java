package com.petsupermarket.restapi.service;

import com.petsupermarket.restapi.dao.ProductoDao;
import com.petsupermarket.restapi.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    ProductoDao productoDao;

    public void createProducto(Producto producto){
        productoDao.createProducto(producto);
    }

    public List<Producto> getAllProducto(){
        return productoDao.getAllProducto();
    }

    public List<Producto> getDiscountProducto(){
        return productoDao.getDiscountProducto();
    }

    public List<Producto> getExistingProducto(){
        return productoDao.getExistingProducto();
    }

    public Producto getProducto(Long productoId){
        return productoDao.getProducto(productoId);
    }

    public void updateProducto(Producto producto){
        productoDao.updateProducto(producto);
    }

}