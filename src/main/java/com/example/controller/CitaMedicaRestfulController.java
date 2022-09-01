package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.repository.model.CitaMedica;
import com.example.service.ICitaMedicaService;

@RestController
@RequestMapping("/citasMedicas")

public class CitaMedicaRestfulController {
	@Autowired 
	private ICitaMedicaService citaMedicaService; 
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE )
	public String crear(@RequestBody CitaMedica citaMedica) {
		String mensaje = "Cita Ingresada correctamente"; 
		try {
			this.citaMedicaService.crear(citaMedica);
		} catch (Exception e) {
			throw new RuntimeException(); 
		}
		return mensaje; 
	}
	
	@PutMapping
	public String actualizar(@RequestBody CitaMedica citaMedica) {
		this.citaMedicaService.actualizar(citaMedica);
		return "Empleado Actualizado";
	}
	@GetMapping(path = "/{idCitaMedica}", produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<CitaMedica> buscarCitaMedica(@PathVariable("idCitaMedica") Integer id) {
		CitaMedica empl = this.citaMedicaService.buscarPorId(id);
		return ResponseEntity.ok(empl);
	}
	@DeleteMapping(path = "{idCitaMedica}")
	public String eliminar(@PathVariable("idCitaMedica") Integer id) {
		this.citaMedicaService.eliminar(id);
		return "Empleado eliminado";
	}
	
}
