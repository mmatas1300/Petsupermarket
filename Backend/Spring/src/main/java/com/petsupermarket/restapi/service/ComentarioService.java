package com.petsupermarket.restapi.service;

import com.petsupermarket.restapi.dao.ComentarioDao;
import com.petsupermarket.restapi.dao.ProductoDao;
import com.petsupermarket.restapi.models.Comentario;
import com.petsupermarket.restapi.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioService {

    @Autowired
    ComentarioDao comentarioDao;

    @Autowired
    ProductoDao productoDao;

    public void createComentarios(Comentario comentario){
        comentarioDao.createComentario(comentario);
    }

    public List<Comentario> getComentarios(Long productoId){
        Producto producto = productoDao.getProducto(productoId);
        return comentarioDao.getComentarioByProducto(producto);
    }

}