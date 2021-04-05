/**
 * 
 */
package com.example.person.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Jozek Andrzej Hajduk Sánchez
 *
 */
//Da a conocer que es una entidad
@Entity
//Se le asigna el nombre de la tabla
@Table(name = "country")
public class Country {

	// Esto le indica cual es la llave primaria de la tabla y permite que se
	// autoincremente los registros a medida que se generan
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;

	public Country() {
		// TODO Auto-generated constructor stub
	}

	public Country(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
