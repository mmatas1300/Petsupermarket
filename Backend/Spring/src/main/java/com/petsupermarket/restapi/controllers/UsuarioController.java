package com.petsupermarket.restapi.controllers;

import com.petsupermarket.restapi.models.Usuario;
import com.petsupermarket.restapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario){
        usuarioService.createUsuario(usuario);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/email")
    public ResponseEntity<String> login(@RequestBody Usuario usuario){
        try{
            String response = usuarioService.login(usuario);
            return new ResponseEntity<>(response,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping
    public ResponseEntity<String> updateUsuario(@RequestBody Usuario usuario){
        try{
            usuarioService.updateUsuario((usuario));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}
