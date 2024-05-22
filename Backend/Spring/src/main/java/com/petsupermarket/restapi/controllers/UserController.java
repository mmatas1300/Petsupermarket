package com.petsupermarket.restapi.controllers;

import com.petsupermarket.restapi.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/api/")
    public User prueba(){
        User myUser = new User();
        myUser.setNombre("Ernesto");
        myUser.setDireccion("Av Juan");
        myUser.setEmail("mmatas@gmail.com");
        return myUser;
    }

}
