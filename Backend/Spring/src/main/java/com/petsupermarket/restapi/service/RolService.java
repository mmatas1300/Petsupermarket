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

    public List<Rol> readAllRol(){
        return rolDao.readAllRol();
    }

    public void createRol(Rol rol){
        rolDao.createRol(rol);
    }

    public void updateRol(Rol rol){
        rolDao.updateRol(rol);
    }

    public void deleteRol(Rol rol){
        rolDao.deleteRol(rol.getId());
    }
}
