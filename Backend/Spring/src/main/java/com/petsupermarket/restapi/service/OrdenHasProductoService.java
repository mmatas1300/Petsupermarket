package com.petsupermarket.restapi.service;

import com.petsupermarket.restapi.dao.OrdenDao;
import com.petsupermarket.restapi.dao.OrdenHasProductoDao;
import com.petsupermarket.restapi.dao.ProductoDao;
import com.petsupermarket.restapi.dao.UsuarioDao;
import com.petsupermarket.restapi.models.Orden;
import com.petsupermarket.restapi.models.OrdenHasProducto;
import com.petsupermarket.restapi.models.Producto;
import com.petsupermarket.restapi.models.Usuario;
import com.petsupermarket.restapi.utils.JWTUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenHasProductoService {

    @Autowired
    OrdenHasProductoDao ordenHasProductoDao;

    @Autowired
    ProductoDao productoDao;

    @Autowired
    OrdenDao ordenDao;

    @Autowired
    JWTUtil jwtUtil;

    @Autowired
    UsuarioDao usuarioDao;

    public void createOrdenHasProducto(OrdenHasProducto ordenHasProducto, Long productoId, String token){
        Producto productoFound = productoDao.getProducto(productoId);
        String email =  jwtUtil.getValue(token);
        Usuario usuarioFound = usuarioDao.getUsuarioByEmail(email);
        Orden ordenFound = ordenDao.getOrdenActiveByUser(usuarioFound);
        ordenHasProducto.setProducto(productoFound);
        ordenHasProducto.setOrden(ordenFound);
        ordenHasProductoDao.createOrdenHasProducto(ordenHasProducto);
    }

    public List<OrdenHasProducto> getOrdenHasProductoByUsuario(String token){
        String email =  jwtUtil.getValue(token);
        Usuario usuarioFound = usuarioDao.getUsuarioByEmail(email);
        Orden ordenFound = ordenDao.getOrdenActiveByUser(usuarioFound);
        return ordenHasProductoDao.getOrdenHasProductoByOrden(ordenFound);
    }

    public void deleteOrdenHasProducto(OrdenHasProducto ordenHasProducto){
        ordenHasProductoDao.deleteOrdenHasProducto(ordenHasProducto);
    }

    public void updateOrdenHasProducto(OrdenHasProducto ordenHasProducto){
        ordenHasProductoDao.updateOrdenHasProducto(ordenHasProducto);
    }
}