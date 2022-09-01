package com.example.service;

import com.example.repository.model.CitaMedica;

public interface ICitaMedicaService {
	public void crear(CitaMedica cita);

	public void actualizar(CitaMedica cita);

	public void eliminar(Integer id);
	
	public CitaMedica buscarPorId(Integer id);
}
