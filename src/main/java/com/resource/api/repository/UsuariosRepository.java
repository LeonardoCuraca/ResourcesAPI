package com.resource.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resource.api.entity.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario,Integer> {

}
