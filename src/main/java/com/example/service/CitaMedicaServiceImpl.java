package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.model.CitaMedica;
import com.example.service.to.CitaMedicaTo;
@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{


	@Autowired
	private ICitaMedicaService citaMedicaService; 
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IDoctorService doctorService;
	
	@Override
	public void crear(CitaMedica cita) {
		// TODO Auto-generated method stub
		this.citaMedicaService.crear(cita);
	}

	@Override
	public void actualizar(CitaMedica cita) {
		// TODO Auto-generated method stub
		this.citaMedicaService.actualizar(cita);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.citaMedicaService.eliminar(id);
	}

	@Override
	public CitaMedica buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.citaMedicaService.buscarPorId(id);
	}

	private CitaMedicaTo convertirCitaMedicaTo(CitaMedica cita) {
		CitaMedicaTo aux = new CitaMedicaTo(); 
		aux.setCime_diagnostico(cita.getCime_diagnostico());
		aux.setCime_fecha_proxima_cita(cita.getCime_fecha_proxima_cita());
		aux.setCime_id(cita.getCime_id());
		aux.setCime_numero_cita(cita.getCime_numero_cita());
		aux.setCime_receta(cita.getCime_receta());
		aux.setCime_valor_cita(cita.getCime_valor_cita());
		return aux; 
	}
	
}
