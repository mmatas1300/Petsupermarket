package com.petsupermarket.restapi.dao;

import com.petsupermarket.restapi.models.Rol;
import java.util.List;

public interface RolDao {
    List<Rol> getRoles();
    Rol createRol(Rol rol);
    Rol updateRol(Long rolId, Rol rol);
    void deleteRol(Long rolId);

}
