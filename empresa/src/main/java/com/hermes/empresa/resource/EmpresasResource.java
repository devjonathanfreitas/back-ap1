package com.hermes.empresa.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hermes.empresa.model.Empresa;
import com.hermes.empresa.repository.Empresas;

@RestController
@RequestMapping("/empresas")
@CrossOrigin("*")
public class EmpresasResource {

	@Autowired
	private Empresas empresas;
	
	@GetMapping
	public List<Empresa> listar(){
		return empresas.findAll();
	}
	
	@PostMapping
	public Empresa criar(@Valid @RequestBody Empresa empresa) {
		return empresas.save(empresa);
	}
}
