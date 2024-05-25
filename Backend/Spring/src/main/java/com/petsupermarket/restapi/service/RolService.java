package com.petsupermarket.restapi.service;

import com.petsupermarket.restapi.dao.RolDao;
import com.petsupermarket.restapi.models.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    @Autowired
    RolDao rolDao;

    public void createRol(Rol rol){
        rolDao.createRol(rol);
    }
}
