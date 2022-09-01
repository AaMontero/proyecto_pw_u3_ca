package com.example.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.example.repository.model.CitaMedica;

public interface ICitaMedicaRepository {
	public void crear(CitaMedica cita); 
	public void actualizar (CitaMedica cita); 
	public void elimiar (Integer id); 
	public CitaMedica buscar(Integer id) ;
	public List<CitaMedica> buscarTodas(); 
	public void agregarCitaMedica(Integer numC, LocalDateTime fecha, BigDecimal Integer, String lugar, String cPaciente, String cDoctor); 
}
