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

    public List<Producto> readAllProducto(){
        return productoDao.readAllProducto();
    }

    public List<Producto> readAllDiscountProducto(){
        return productoDao.readAllDiscountProducto();
    }

}