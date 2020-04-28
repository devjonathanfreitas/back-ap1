package com.hermes.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hermes.empresa.model.Empresa;

public interface Empresas extends JpaRepository<Empresa, Long>{

}
