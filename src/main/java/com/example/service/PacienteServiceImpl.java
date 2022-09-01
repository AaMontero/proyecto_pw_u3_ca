package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.IPacienteRepository;
import com.example.repository.model.Paciente;
import com.example.service.to.PacienteTo;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepository pacienteRepository; 
	
	
	@Override
	public void crear(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.crear(paciente);
	}

	@Override
	public Paciente buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.buscar(cedula);
	}
	private PacienteTo convertirEmpleadoTo(Paciente paciente){
		PacienteTo aux = new PacienteTo();
		aux.setPaci_apellido(paciente.getPaci_apellido());
		aux.setPaci_cedula(paciente.getPaci_cedula());
		aux.setPaci_codigo_seguro(paciente.getPaci_codigo_seguro());
		aux.setPaci_estatura(paciente.getPaci_estatura());
		aux.setPaci_fecha_nacimiento(paciente.getPaci_fecha_nacimiento());
		aux.setPaci_genero(paciente.getPaci_genero());
		aux.setPaci_peso(paciente.getPaci_peso());
		aux.setPaci_id(paciente.getPaci_id());
		return aux;
	}

}
