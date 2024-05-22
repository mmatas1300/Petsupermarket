package com.petsupermarket.restapi.controllers;

import com.petsupermarket.restapi.dao.RolDao;
import com.petsupermarket.restapi.models.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/roles")
public class RolController {
    @Autowired
    RolDao rolDao;

    @GetMapping
    public List<Rol> getRoles(){
        return rolDao.getRoles();
    }


}
