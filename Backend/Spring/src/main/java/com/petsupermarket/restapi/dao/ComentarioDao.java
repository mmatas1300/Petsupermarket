package com.petsupermarket.restapi.dao;

import com.petsupermarket.restapi.models.Comentario;
import com.petsupermarket.restapi.models.Producto;

import java.util.List;

public interface ComentarioDao {
    void createComentario(Comentario comentario);
    List<Comentario> getComentarioByProducto(Producto producto);
}
