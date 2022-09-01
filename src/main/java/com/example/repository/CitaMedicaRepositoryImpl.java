package com.example.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.repository.model.CitaMedica;
@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository {
	
	private EntityManager em; 
	
	@Override
	public void crear(CitaMedica cita) {
		// TODO Auto-generated method stub
		this.em.persist(cita);
	}

	@Override
	public void actualizar(CitaMedica cita) {
		// TODO Auto-generated method stub
		this.em.merge(cita);
	}

	@Override
	public void elimiar(Integer id) {
		// TODO Auto-generated method stub
		this.em.remove(buscar(id));
	}

	@Override
	public CitaMedica buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.em.find(CitaMedica.class, id);
	}

	@Override
	public List<CitaMedica> buscarTodas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregarCitaMedica(Integer numC, LocalDateTime fecha, BigDecimal Integer, String lugar, String cPaciente,
			String cDoctor) {
		// TODO Auto-generated method stub
		
	}

}
