package com.petsupermarket.restapi.dao;

import com.petsupermarket.restapi.models.Producto;

import java.util.List;

public interface ProductoDao {
    void createProducto(Producto producto);
    List<Producto> getAllProducto();
    List<Producto> getDiscountProducto();
    List<Producto> getExistingProducto();
    Producto getProducto(Long productoId);
    void updateProducto(Producto producto);
}
