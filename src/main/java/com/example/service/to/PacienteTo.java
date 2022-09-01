package com.example.service.to;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import com.example.repository.model.CitaMedica;

public class PacienteTo extends RepresentationModel<PacienteTo> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8088607649315426522L;
	private Integer paci_id;
	private String paci_cedula; 
	private String paci_nombre; 
	private String paci_apellido; 
	private LocalDateTime paci_fecha_nacimiento;
	private String paci_codigo_seguro;
	private BigDecimal paci_estatura;
	private BigDecimal paci_peso;
	private String paci_genero;
    private List<CitaMedica> citasMedicas;
	public Integer getPaci_id() {
		return paci_id;
	}
	public void setPaci_id(Integer paci_id) {
		this.paci_id = paci_id;
	}
	public String getPaci_cedula() {
		return paci_cedula;
	}
	public void setPaci_cedula(String paci_cedula) {
		this.paci_cedula = paci_cedula;
	}
	public String getPaci_nombre() {
		return paci_nombre;
	}
	public void setPaci_nombre(String paci_nombre) {
		this.paci_nombre = paci_nombre;
	}
	public String getPaci_apellido() {
		return paci_apellido;
	}
	public void setPaci_apellido(String paci_apellido) {
		this.paci_apellido = paci_apellido;
	}
	public LocalDateTime getPaci_fecha_nacimiento() {
		return paci_fecha_nacimiento;
	}
	public void setPaci_fecha_nacimiento(LocalDateTime paci_fecha_nacimiento) {
		this.paci_fecha_nacimiento = paci_fecha_nacimiento;
	}
	public String getPaci_codigo_seguro() {
		return paci_codigo_seguro;
	}
	public void setPaci_codigo_seguro(String paci_codigo_seguro) {
		this.paci_codigo_seguro = paci_codigo_seguro;
	}
	public BigDecimal getPaci_estatura() {
		return paci_estatura;
	}
	public void setPaci_estatura(BigDecimal paci_estatura) {
		this.paci_estatura = paci_estatura;
	}
	public BigDecimal getPaci_peso() {
		return paci_peso;
	}
	public void setPaci_peso(BigDecimal paci_peso) {
		this.paci_peso = paci_peso;
	}
	public String getPaci_genero() {
		return paci_genero;
	}
	public void setPaci_genero(String paci_genero) {
		this.paci_genero = paci_genero;
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
