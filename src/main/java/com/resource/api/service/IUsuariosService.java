package com.resource.api.service;

import java.util.List;

import com.resource.api.entity.Usuario;



public interface IUsuariosService {
	
	List<Usuario> buscarTodos();
	void guardar(Usuario usuario);
	void eliminar(int idUsuario);
}
