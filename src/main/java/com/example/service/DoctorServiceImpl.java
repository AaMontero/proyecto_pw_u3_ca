package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.IDoctorRepository;
import com.example.repository.model.Doctor;
import com.example.service.to.DoctorTo;


@Service
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
	private IDoctorRepository doctorRepository; 
	
	
	@Override
	public void crear(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.crear(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepository.actualizar(doctor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.doctorRepository.eliminar(id);
	}

	@Override
	public Doctor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.doctorRepository.buscar(id);
	}
	private DoctorTo convertirDoctorTo(Doctor doctor) {
		DoctorTo aux = new DoctorTo(); 
		aux.setCodigo_senescyt(doctor.getCodigo_senescyt());
		aux.setDoct_apellido(doctor.getDoct_apellido());
		aux.setDoct_cedula(doctor.getDoct_cedula());
		aux.setDoct_fecha_nacimiento(doctor.getDoct_fecha_nacimiento());
		aux.setDoct_genero(doctor.getDoct_genero());
		aux.setDoct_id(doctor.getDoct_id());
		aux.setDoct_nombre(doctor.getDoct_nombre());
		aux.setDoct_numero_consultorio(doctor.getDoct_numero_consultorio());
		return aux; 
	}
	

}
