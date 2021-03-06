package ar.com.ProyectoClub.Dominio;
// Generated 19-oct-2016 11:03:04 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Alquiler generated by hbm2java
 */
public class Alquiler implements java.io.Serializable {

	private Integer nroAlquiler;
	private Inmuebles inmuebles;
	private Nosocio nosocio;
	private Socios socios;
	private Date fechaActual;
	private Date horaActual;
	private Date fechaReserva;
	private Date horaReserva;
	private float precioTotal;
	private Set cajaAlquilers = new HashSet(0);

	public Alquiler() {
	}

	public Alquiler(Inmuebles inmuebles, Date fechaActual, Date horaActual,
			Date fechaReserva, Date horaReserva, float precioTotal) {
		this.inmuebles = inmuebles;
		this.fechaActual = fechaActual;
		this.horaActual = horaActual;
		this.fechaReserva = fechaReserva;
		this.horaReserva = horaReserva;
		this.precioTotal = precioTotal;
	}

	public Alquiler(Inmuebles inmuebles, Nosocio nosocio, Socios socios,
			Date fechaActual, Date horaActual, Date fechaReserva,
			Date horaReserva, float precioTotal, Set cajaAlquilers) {
		this.inmuebles = inmuebles;
		this.nosocio = nosocio;
		this.socios = socios;
		this.fechaActual = fechaActual;
		this.horaActual = horaActual;
		this.fechaReserva = fechaReserva;
		this.horaReserva = horaReserva;
		this.precioTotal = precioTotal;
		this.cajaAlquilers = cajaAlquilers;
	}

	public Integer getNroAlquiler() {
		return this.nroAlquiler;
	}

	public void setNroAlquiler(Integer nroAlquiler) {
		this.nroAlquiler = nroAlquiler;
	}

	public Inmuebles getInmuebles() {
		return this.inmuebles;
	}

	public void setInmuebles(Inmuebles inmuebles) {
		this.inmuebles = inmuebles;
	}

	public Nosocio getNosocio() {
		return this.nosocio;
	}

	public void setNosocio(Nosocio nosocio) {
		this.nosocio = nosocio;
	}

	public Socios getSocios() {
		return this.socios;
	}

	public void setSocios(Socios socios) {
		this.socios = socios;
	}

	public Date getFechaActual() {
		return this.fechaActual;
	}

	public void setFechaActual(Date fechaActual) {
		this.fechaActual = fechaActual;
	}

	public Date getHoraActual() {
		return this.horaActual;
	}

	public void setHoraActual(Date horaActual) {
		this.horaActual = horaActual;
	}

	public Date getFechaReserva() {
		return this.fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public Date getHoraReserva() {
		return this.horaReserva;
	}

	public void setHoraReserva(Date horaReserva) {
		this.horaReserva = horaReserva;
	}

	public float getPrecioTotal() {
		return this.precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Set getCajaAlquilers() {
		return this.cajaAlquilers;
	}

	public void setCajaAlquilers(Set cajaAlquilers) {
		this.cajaAlquilers = cajaAlquilers;
	}

}
