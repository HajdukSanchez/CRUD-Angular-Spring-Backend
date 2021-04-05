/**
 * 
 */
package com.example.person.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Jozek Andrzej Hajduk Sánchez
 *
 */
//Da a conocer que es una entidad
@Entity
//Se le asigna el nombre de la tabla
@Table(name = "state")
public class State {

	// Esto le indica cual es la llave primaria de la tabla y permite que se
	// autoincremente los registros a medida que se generan
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nombre;
	@ManyToOne
	@JoinColumn(name = "fk_country_state")
	private Country country;

	public State() {
		// TODO Auto-generated constructor stub
	}

	public State(long id, String nombre, Country country) {
		this.id = id;
		this.nombre = nombre;
		this.country = country;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
