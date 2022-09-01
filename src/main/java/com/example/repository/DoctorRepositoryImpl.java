package com.example.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.repository.model.Doctor;
@Repository
@Transactional
public class DoctorRepositoryImpl implements IDoctorRepository{
	
	private EntityManager em; 
	@Override
	public void crear(Doctor doctor) {
		// TODO Auto-generated method stub
		this.em.persist(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.em.merge(doctor); 
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.em.remove(buscar(id));
	}

	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.em.find(Doctor.class, id);
	}

}
