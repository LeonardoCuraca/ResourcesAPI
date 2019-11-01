package com.resource.api.service;

import java.util.List;
import java.util.Optional;

import com.resource.api.entity.Negocio;



public interface INegociosService {
	
	List<Negocio> listarNegocio();
	void guardar(Negocio negocio);
	void eliminar(int idNegocio);
	Optional<Negocio> buscarNegocio(int idUsuario);
}
