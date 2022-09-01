package com.example.service.to;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.hateoas.RepresentationModel;
import com.example.repository.model.CitaMedica;

public class DoctorTo extends RepresentationModel<DoctorTo> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2604928220904457688L;
	private Integer doct_id; 
	private String doct_cedula; 
	private String doct_nombre; 
	private String doct_apellido; 
	private LocalDateTime doct_fecha_nacimiento;
	private String doct_numero_consultorio;
	private String codigo_senescyt;
	private String doct_genero;
    List<CitaMedica> citasMedicas;
	public Integer getDoct_id() {
		return doct_id;
	}
	public void setDoct_id(Integer doct_id) {
		this.doct_id = doct_id;
	}
	public String getDoct_cedula() {
		return doct_cedula;
	}
	public void setDoct_cedula(String doct_cedula) {
		this.doct_cedula = doct_cedula;
	}
	public String getDoct_nombre() {
		return doct_nombre;
	}
	public void setDoct_nombre(String doct_nombre) {
		this.doct_nombre = doct_nombre;
	}
	public String getDoct_apellido() {
		return doct_apellido;
	}
	public void setDoct_apellido(String doct_apellido) {
		this.doct_apellido = doct_apellido;
	}
	public LocalDateTime getDoct_fecha_nacimiento() {
		return doct_fecha_nacimiento;
	}
	public void setDoct_fecha_nacimiento(LocalDateTime doct_fecha_nacimiento) {
		this.doct_fecha_nacimiento = doct_fecha_nacimiento;
	}
	public String getDoct_numero_consultorio() {
		return doct_numero_consultorio;
	}
	public void setDoct_numero_consultorio(String doct_numero_consultorio) {
		this.doct_numero_consultorio = doct_numero_consultorio;
	}
	public String getCodigo_senescyt() {
		return codigo_senescyt;
	}
	public void setCodigo_senescyt(String codigo_senescyt) {
		this.codigo_senescyt = codigo_senescyt;
	}
	public String getDoct_genero() {
		return doct_genero;
	}
	public void setDoct_genero(String doct_genero) {
		this.doct_genero = doct_genero;
	}
	public List<CitaMedica> getCitasMedicas() {
		return citasMedicas;
	}
	public void setCitasMedicas(List<CitaMedica> citasMedicas) {
		this.citasMedicas = citasMedicas;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
