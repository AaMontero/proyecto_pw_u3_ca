package com.example.repository;

import com.example.repository.model.Paciente;

public interface IPacienteRepository {
	public void crear(Paciente paciente);
	public Paciente buscar(String cedula); 
}
