package com.petsupermarket.restapi.dao;

import com.petsupermarket.restapi.models.Orden;
import com.petsupermarket.restapi.models.OrdenHasProducto;

import java.util.List;

public interface OrdenHasProductoDao {
    void createOrdenHasProducto(OrdenHasProducto ordenHasProducto);
    List<OrdenHasProducto> getOrdenHasProductoByOrden(Orden orden);
    void deleteOrdenHasProducto(OrdenHasProducto ordenHasProducto);
    void updateOrdenHasProducto(OrdenHasProducto ordenHasProducto);
}
