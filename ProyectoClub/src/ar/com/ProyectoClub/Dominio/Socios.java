package ar.com.ProyectoClub.Dominio;
// Generated 18-oct-2016 10:22:11 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Socios generated by hbm2java
 */
public class Socios implements java.io.Serializable {

	private Integer dniSocios;
	private Categoria categoria;
	private Personas personas;
	private Integer matricula;
	private Integer nroSocio;
	private String sexo;
	private String estado;
	private String nacionalidad;
	private String estadocivil;
	private Date fechaingreso;
	private Set alquilers = new HashSet(0);
	private Set cuotas = new HashSet(0);

	public Socios() {
	}

	public Socios(Categoria categoria, Personas personas, Integer matricula,
			Integer nroSocio, String sexo, String estado, String nacionalidad,
			String estadocivil, Date fechaingreso) {
		this.categoria = categoria;
		this.personas = personas;
		this.matricula = matricula;
		this.nroSocio = nroSocio;
		this.sexo = sexo;
		this.estado = estado;
		this.nacionalidad = nacionalidad;
		this.estadocivil = estadocivil;
		this.fechaingreso = fechaingreso;
	}

	public Socios(Categoria categoria, Personas personas, Integer matricula,
			Integer nroSocio, String sexo, String estado, String nacionalidad,
			String estadocivil, Date fechaingreso, Set alquilers, Set cuotas) {
		this.categoria = categoria;
		this.personas = personas;
		this.matricula = matricula;
		this.nroSocio = nroSocio;
		this.sexo = sexo;
		this.estado = estado;
		this.nacionalidad = nacionalidad;
		this.estadocivil = estadocivil;
		this.fechaingreso = fechaingreso;
		this.alquilers = alquilers;
		this.cuotas = cuotas;
	}

	public Integer getDniSocios() {
		return this.dniSocios;
	}

	public void setDniSocios(Integer dniSocios) {
		this.dniSocios = dniSocios;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Personas getPersonas() {
		return this.personas;
	}

	public void setPersonas(Personas personas) {
		this.personas = personas;
	}

	public Integer getMatricula() {
		return this.matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Integer getNroSocio() {
		return this.nroSocio;
	}

	public void setNroSocio(Integer nroSocio) {
		this.nroSocio = nroSocio;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getEstadocivil() {
		return this.estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public Date getFechaingreso() {
		return this.fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public Set getAlquilers() {
		return this.alquilers;
	}

	public void setAlquilers(Set alquilers) {
		this.alquilers = alquilers;
	}

	public Set getCuotas() {
		return this.cuotas;
	}

	public void setCuotas(Set cuotas) {
		this.cuotas = cuotas;
	}

}
