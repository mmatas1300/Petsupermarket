package com.petsupermarket.restapi.service;

import com.petsupermarket.restapi.dao.OrdenDao;
import com.petsupermarket.restapi.dao.UsuarioDao;
import com.petsupermarket.restapi.models.Orden;
import com.petsupermarket.restapi.models.Usuario;
import com.petsupermarket.restapi.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenService {

    @Autowired
    OrdenDao ordenDao;

    @Autowired
    JWTUtil jwtUtil;

    @Autowired
    UsuarioDao usuarioDao;

    public void createOrden(Orden orden, String token){
        String email =  jwtUtil.getValue(token);
        Usuario usuarioFound = usuarioDao.getUsuarioByEmail(email);
        orden.setUsuario(usuarioFound);
        ordenDao.createOrden(orden);
    }

    public Orden getActiveOrden(String token){
        String email =  jwtUtil.getValue(token);
        Usuario usuarioFound = usuarioDao.getUsuarioByEmail(email);
        return ordenDao.getOrdenActiveByUser(usuarioFound);
    }

    public void updateOrden(Orden orden, String token){
        String email =  jwtUtil.getValue(token);
        Usuario usuarioFound = usuarioDao.getUsuarioByEmail(email);
        Orden ordenFound = ordenDao.getOrdenActiveByUser(usuarioFound);
        orden.setUsuario(usuarioFound);
        orden.setId(ordenFound.getId());
        ordenDao.updateOrden(orden);
    }
}