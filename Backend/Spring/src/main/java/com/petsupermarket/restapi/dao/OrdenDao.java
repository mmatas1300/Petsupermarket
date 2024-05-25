package com.petsupermarket.restapi.dao;

import com.petsupermarket.restapi.models.Orden;
import com.petsupermarket.restapi.models.Usuario;

import java.util.List;

public interface OrdenDao {
    void createOrden(Orden orden);
    Orden getOrdenActiveByUser(Usuario usuario);
    void updateOrden(Orden orden);
}
