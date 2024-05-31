package com.petsupermarket.restapi.service;

import com.petsupermarket.restapi.dao.RolDao;
import com.petsupermarket.restapi.dao.UsuarioDao;
import com.petsupermarket.restapi.dto.UsuarioDto;
import com.petsupermarket.restapi.models.Rol;
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

    @Autowired
    UsuarioDto usuarioDto;

    @Autowired
    RolDao rolDao;

    public void createUsuario(Usuario usuario){
        usuario.setRol(rolDao.getUserRol());
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

    public void updateUsuario(Usuario usuario, String token){
        String userEmail= jwtUtil.getValue(token);
        Usuario usuarioFound = usuarioDao.getUsuarioByEmail(userEmail);
        usuario.setId(usuarioFound.getId());
        usuario.setEmail(usuarioFound.getEmail());
        usuario.setPassword(usuarioFound.getPassword());
        usuario.setFechaNacimiento(usuarioFound.getFechaNacimiento());
        usuario.setRol(usuarioFound.getRol());
        usuarioDao.updateUsuario(usuario);
    }

    public UsuarioDto getUsuarioInfo(String token){
        String userEmail= jwtUtil.getValue(token);
        Usuario usuarioFound = usuarioDao.getUsuarioByEmail(userEmail);
        usuarioDto.setNombre(usuarioFound.getNombre());
        usuarioDto.setDireccion(usuarioFound.getDireccion());
        usuarioDto.setTelefono(usuarioFound.getTelefono());
        usuarioDto.setCiudad(usuarioFound.getCiudad());
        usuarioDto.setCp(usuarioFound.getCp());
        return usuarioDto;
    }

}
