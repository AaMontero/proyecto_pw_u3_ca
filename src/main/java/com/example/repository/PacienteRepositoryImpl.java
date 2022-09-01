package com.example.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.repository.model.Paciente;
@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository{
	private EntityManager em; 
	@Override
	public void crear(Paciente paciente) {
		// TODO Auto-generated method stub
		this.em.persist(paciente);
	}

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.em.find(Paciente.class, cedula); 
		
	}

}
