
package com.petsupermarket.restapi.dao;

import com.petsupermarket.restapi.models.Usuario;

public interface UsuarioDao {
    void createUsuario(Usuario usuario);
    Usuario getUsuarioByEmail(String email);
    void updateUsuario(Usuario usuario);
}
