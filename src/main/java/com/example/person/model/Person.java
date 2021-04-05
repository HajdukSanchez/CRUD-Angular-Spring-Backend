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
// Se le asigna el nombre de la tabla
@Table(name = "person")
public class Person {

	// Esto le indica cual es la llave primaria de la tabla y permite que se
	// autoincremente los registros a medida que se generan
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	// @Column(name = "Nombre_en_la_base_datos")
	private String name;
	private String lastName;
	private int age;

	// Se le indica la relación que va a tener con la tabla country
	// se le da el nombre que va a llevar dicha relación
	@ManyToOne
	@JoinColumn(name = "fk_person_country")
	private Country country;
	@ManyToOne
	@JoinColumn(name = "fk_person_state")
	private State state;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(long id, String name, String lastName, int age, Country country, State state) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.country = country;
		this.state = state;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
