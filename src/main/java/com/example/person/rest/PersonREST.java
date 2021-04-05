/**
 * 
 */
package com.example.person.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.person.model.Person;
import com.example.person.service.PersonService;

/**
 * @author Jozek Andrzej Hajduk Sánchez
 *
 */

@RestController
@RequestMapping("/person/")
public class PersonREST {

	@Autowired
	private PersonService personService;

	@GetMapping
	private ResponseEntity<List<Person>> getAllPersons() {
		return ResponseEntity.ok(personService.findAll());
	}

	// Para guardar se utiliza la anotación @POST
	@PostMapping
	private ResponseEntity<Person> savePerson(@RequestBody Person item) {
		// El request body significa que es obligatorio hacer el post para poder
		// utilizar correctamente el método
		try {
			Person personSave = personService.save(item); // Este es le objeto del llamado a guardar persona que se va a
															// generar
			// Se devuleve la respuesta de el guardado de la persona de no llegar a haber un
			// error
			return ResponseEntity.created(new URI("/person/" + personSave.getId())).body(personSave);
		} catch (Exception e) {
			// Si llegase a ocurrir algun error, se envia un mensaje con el error que
			// ocurrio
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	// Permite eliminar de la base de datos
	@DeleteMapping(value = "/delete/{id}")
	private ResponseEntity<Boolean> deletePerson(@PathVariable("id") long idPerson) {
		personService.deleteById(idPerson); // Elimina la persona de la base de datos
		// Devolvera true o false si una vez se elimine, al buscar no encuentra el ID
		return ResponseEntity.ok(!(personService.findById(idPerson) != null));
	}

}
