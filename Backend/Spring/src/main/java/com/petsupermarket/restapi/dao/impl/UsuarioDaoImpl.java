package com.petsupermarket.restapi.dao.impl;

import com.petsupermarket.restapi.dao.UsuarioDao;
import com.petsupermarket.restapi.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImpl implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public void createUsuario(Usuario usuario) {
        List<Usuario> listUsuario = entityManager.createQuery("From Usuario WHERE email =:email").setParameter("email",usuario.getEmail()).getResultList();
        if(!listUsuario.isEmpty()) throw new IllegalStateException("User already exists with email");
        entityManager.persist(usuario);
    }

    @Override
    public Usuario getUsuarioByEmail(String email) {
        List<Usuario> listUsuario = entityManager.createQuery("From Usuario WHERE email =:email").setParameter("email",email).getResultList();
        if(listUsuario.isEmpty()) throw new IllegalStateException("User does not exist with email " + email);
        else return listUsuario.get(0);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        entityManager.merge(usuario);
    }
}