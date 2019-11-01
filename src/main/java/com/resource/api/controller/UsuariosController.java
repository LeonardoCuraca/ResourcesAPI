package com.resource.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resource.api.entity.Usuario;
import com.resource.api.service.IUsuariosService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class UsuariosController {
	
	@Autowired
	private IUsuariosService serviceUsuarios;
	
	@GetMapping("/listado")
	public List<Usuario> buscarTodos(){
		return serviceUsuarios.buscarTodos();
	}
	
	@PostMapping("/listado")
	public Usuario guardar(@RequestBody Usuario usuario) {	
		serviceUsuarios.guardar(usuario);
		return usuario;		
	}
	@PutMapping("/listado")
	public Usuario modificar(@RequestBody Usuario usuario) {
		serviceUsuarios.guardar(usuario);
		return usuario;
	} 
	@DeleteMapping("/listado/{id}")
	public String eliminar(@PathVariable("id") int idUsuario) {
		serviceUsuarios.eliminar(idUsuario);
		return "Registro eliminado";
	}
	
}
