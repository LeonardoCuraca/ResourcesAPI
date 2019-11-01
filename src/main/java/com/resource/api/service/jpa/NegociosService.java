package com.resource.api.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resource.api.entity.Negocio;
import com.resource.api.repository.NegociosRepository;
import com.resource.api.service.INegociosService;


@Service
public class NegociosService implements INegociosService{
	
	@Autowired
	private NegociosRepository repoNegocios;
	
	public List<Negocio> listarNegocio() {
		return repoNegocios.findAll();
	}

	@Override
	public void guardar(Negocio negocio) {
		repoNegocios.save(negocio);		
	}

	@Override
	public void eliminar(int idNegocio) {
		repoNegocios.deleteById(idNegocio);
	}

	@Override
	public Optional<Negocio> buscarNegocio(int idUsuario) {
		return repoNegocios.findById(idUsuario);
	}

}
