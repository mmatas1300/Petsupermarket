package com.petsupermarket.restapi.dao;

import com.petsupermarket.restapi.models.Rol;
import java.util.List;

public interface RolDao {
    List<Rol> readAllRol();
    void createRol(Rol rol);
    void updateRol(Rol rol);
    void deleteRol(Long rolId);
}