package com.example.service;

import com.example.repository.model.Paciente;

public interface IPacienteService {
	public void crear(Paciente paciente);
	public Paciente buscar(String cedula); 
	
}
