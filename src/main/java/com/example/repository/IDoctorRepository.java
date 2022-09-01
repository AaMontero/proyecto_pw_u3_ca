package com.example.repository;
import com.example.repository.model.Doctor;



public interface IDoctorRepository {
	public void crear(Doctor doctor); 
	public void actualizar (Doctor doctor); 
	public void eliminar (Integer id); 
	public Doctor buscar(Integer id) ;
}
