package com.example.repository.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cita_medica")
public class CitaMedica {
	@Id
	@Column(name = "cime_id")
	private Integer cime_id;
	@Column(name = "cime_numero_cita")
	private String cime_numero_cita;
	@Column(name = "cime_fecha_cita")
	private LocalDateTime cime_fecha_cita ;
	@Column(name = "cime_valor_cita")
	private BigDecimal cime_valor_cita;
	@Column(name = "cime_lugar_cita")
	private String cime_lugar_cita;
	
	@Column(name = "cime_diagnostico")
	private String cime_diagnostico;
	@Column(name = "cime_receta")
	private String cime_receta;
	@Column(name = "cime_fecha_proxima_cita")
	private LocalDateTime cime_fecha_proxima_cita;
	@ManyToOne
	@JoinColumn(name = "cime_id_doct")
	private Doctor doctor ;

	@ManyToOne
	@JoinColumn(name = "cime_id_paci")
	private Paciente paciente;

	public CitaMedica(Integer numC, LocalDateTime fecha, BigDecimal valor, String lugar, String cPaciente,
			String cDoctor) {
		this.cime_id = numC; 
		this.cime_fecha_cita = fecha; 
		this.cime_valor_cita = valor; 
		this.cime_lugar_cita = lugar; 	
	}
	
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

	public LocalDateTime getCime_fecha_cita() {
		return cime_fecha_cita;
	}

	public void setCime_fecha_cita(LocalDateTime cime_fecha_cita) {
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

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getCime_lugar_cita() {
		return cime_lugar_cita;
	}

	public void setCime_lugar_cita(String cime_lugar_cita) {
		this.cime_lugar_cita = cime_lugar_cita;
	}
	
	
	
}
