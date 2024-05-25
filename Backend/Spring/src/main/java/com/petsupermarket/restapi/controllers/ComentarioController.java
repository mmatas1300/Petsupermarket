package com.petsupermarket.restapi.controllers;

import com.petsupermarket.restapi.models.Comentario;
import com.petsupermarket.restapi.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/comentarios")
public class ComentarioController {

    @Autowired
    ComentarioService comentarioService;

    @PostMapping
    public ResponseEntity<String> createComentario(@RequestBody Comentario comentario){
        comentarioService.createComentarios(comentario);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("{productoId}")
    public List<Comentario> getComentario(@PathVariable("productoId") Long productoId){
        return comentarioService.getComentarios(productoId);
    }
}