package com.petsupermarket.restapi.service;

import com.petsupermarket.restapi.dao.UsuarioDao;
import com.petsupermarket.restapi.models.Usuario;
import com.petsupermarket.restapi.utils.JWTUtil;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioDao usuarioDao;

    @Autowired
    JWTUtil jwtUtil;

    public void createUsuario(Usuario usuario){
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2i);
        String hash = argon2.hash(2, 1024,1, usuario.getPassword());
        usuario.setPassword(hash);
        usuarioDao.createUsuario(usuario);
    }

    public String login(Usuario usuario){
        Usuario usuarioFound = usuarioDao.getUsuarioByEmail(usuario.getEmail());
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2i);
        if(argon2.verify(usuarioFound.getPassword(),usuario.getPassword()))
            return jwtUtil.create(String.valueOf(usuarioFound.getId()),usuarioFound.getEmail());
        else throw new IllegalStateException("Credenciales incorrectas");
    }

    public void updateUsuario(Usuario usuario){
        usuarioDao.updateUsuario(usuario);
    }

}
