package com.example.service.to;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.hateoas.RepresentationModel;

public class CitaMedicaTo extends RepresentationModel<CitaMedicaTo> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7149520519938704593L;
	private Integer cime_id;
	private String cime_numero_cita;
	private String cime_fecha_cita;
	private BigDecimal cime_valor_cita;
	private String cime_diagnostico;
	private String cime_receta;
	private LocalDateTime cime_fecha_proxima_cita;
	public Integer getCime_id() {
		return cime_id;
	}
	public void setCime_id(Integer cime_id) {
		this.cime_id = cime_id;
	}
	public String getCime_numero_cita() {
		return cime_numero_cita;
	}
	public void setCime_numero_cita(String cime_numero_cita) {
		this.cime_numero_cita = cime_numero_cita;
	}
	public String getCime_fecha_cita() {
		return cime_fecha_cita;
	}
	public void setCime_fecha_cita(String cime_fecha_cita) {
		this.cime_fecha_cita = cime_fecha_cita;
	}
	public BigDecimal getCime_valor_cita() {
		return cime_valor_cita;
	}
	public void setCime_valor_cita(BigDecimal cime_valor_cita) {
		this.cime_valor_cita = cime_valor_cita;
	}
	public String getCime_diagnostico() {
		return cime_diagnostico;
	}
	public void setCime_diagnostico(String cime_diagnostico) {
		this.cime_diagnostico = cime_diagnostico;
	}
	public String getCime_receta() {
		return cime_receta;
	}
	public void setCime_receta(String cime_receta) {
		this.cime_receta = cime_receta;
	}
	public LocalDateTime getCime_fecha_proxima_cita() {
		return cime_fecha_proxima_cita;
	}
	public void setCime_fecha_proxima_cita(LocalDateTime cime_fecha_proxima_cita) {
		this.cime_fecha_proxima_cita = cime_fecha_proxima_cita;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	}
