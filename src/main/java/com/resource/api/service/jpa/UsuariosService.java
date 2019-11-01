package com.resource.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resource.api.entity.Usuario;
import com.resource.api.repository.UsuariosRepository;
import com.resource.api.service.IUsuariosService;

@Service
public class UsuariosService implements IUsuariosService {
	
	@Autowired
	private UsuariosRepository repoUsuarios;
	
	public List<Usuario> buscarTodos() {
		return repoUsuarios.findAll();
	}

	@Override
	public void guardar(Usuario usuario) {
		 repoUsuarios.save(usuario);		
	}

	@Override
	public void eliminar(int idUsuario) {
		repoUsuarios.deleteById(idUsuario);
	}
}
