package com.petsupermarket.restapi.controllers;

import com.petsupermarket.restapi.dto.UsuarioDto;
import com.petsupermarket.restapi.models.Usuario;
import com.petsupermarket.restapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<String> createUsuario(@RequestBody Usuario usuario){
        try{
            usuarioService.createUsuario(usuario);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }

    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario usuario){
        try{
            String response = usuarioService.login(usuario);
            return new ResponseEntity<>(response,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping
    public ResponseEntity<String> updateUsuario(@RequestHeader(value = "Authorization") String token, @RequestBody Usuario usuario){
        try{
            usuarioService.updateUsuario(usuario,token);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<UsuarioDto> getUsuarioInfo(@RequestHeader(value = "Authorization") String token){
        try{
            UsuarioDto usuarioFound = usuarioService.getUsuarioInfo(token);
            return new ResponseEntity<>(usuarioFound,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}