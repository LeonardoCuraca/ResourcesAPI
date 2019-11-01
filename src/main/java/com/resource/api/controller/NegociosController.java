package com.resource.api.controller;

import java.util.List;
import java.util.Optional;

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

import com.resource.api.entity.Negocio;
import com.resource.api.service.INegociosService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class NegociosController {
	@Autowired
	private INegociosService serviceNegocios;
	
	@GetMapping("/negocio")
	public List<Negocio> listarNegocio(){
		return serviceNegocios.listarNegocio();
	}
	
	@GetMapping("/negocio{idUsuario}")
	public Optional<Negocio> buscarNegocio(@RequestBody int idUsuario){
		return serviceNegocios.buscarNegocio(idUsuario);
	}
	
	@PostMapping("/negocio")
	public Negocio guardar(@RequestBody Negocio negocio) {	
		serviceNegocios.guardar(negocio);
		return negocio;		
	}
	@PutMapping("/negocio")
	public Negocio modificar(@RequestBody Negocio negocio) {
		serviceNegocios.guardar(negocio);
		return negocio;
	} 
	@DeleteMapping("/negocio/{id}")
	public String eliminar(@PathVariable("id") int idNegocio) {
		serviceNegocios.eliminar(idNegocio);
		return "Negocio eliminado";
	}
}
