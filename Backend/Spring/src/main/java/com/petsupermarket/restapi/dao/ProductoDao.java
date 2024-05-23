package com.petsupermarket.restapi.dao;

import com.petsupermarket.restapi.models.Producto;

import java.util.List;

public interface ProductoDao {
    List<Producto> readAllProducto();
    List<Producto> readAllDiscountProducto();
    Producto readProducto(Producto producto);
}
