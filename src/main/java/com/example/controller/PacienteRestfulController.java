package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repository.model.Paciente;
import com.example.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteRestfulController {

	@Autowired
	private IPacienteService pacienteService; 
	
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE )
	public String crear(@RequestBody Paciente paciente) {
		String mensaje = "Empleado insertado correctamente";
		try {
			this.pacienteService.crear(paciente);
		} catch (Exception e) {
			mensaje = "Error intente de nuevo";
			throw new RuntimeException();
		}

		return mensaje;
	}
	
	@GetMapping(path = "/{idPaciente}", produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Paciente> buscarPaciente(@PathVariable("idPaciente") String id) {
		Paciente paciente = this.pacienteService.buscar(id);
		return ResponseEntity.ok(paciente);
	}
	
}
