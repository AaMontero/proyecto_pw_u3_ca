package com.example.service;

import com.example.repository.model.Doctor;

public interface IDoctorService {
	public void crear(Doctor doctor); 
	public void actualizar (Doctor doctor); 
	public void eliminar (Integer id); 
	public Doctor buscar(Integer id) ;
}
