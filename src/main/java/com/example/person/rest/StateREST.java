/**
 * 
 */
package com.example.person.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.person.model.State;
import com.example.person.service.StateService;

/**
 * @author Jozek Andrzej Hajduk Sánchez
 *
 */

//Se le indica que es una REST mediante la cual se va a poder acceder a los servicios que ofrece
@RestController
//Es la URL mediante la cual se va a poder utilizar los servicios de esta clase
@RequestMapping("/state/")
public class StateREST {

	@Autowired
	private StateService stateService;

	// Esta variable se utiliza puedto que en la petición GET externa, debe llegar
	// una vraiable para devolver la información
	// El Path de la firma de la clase, debe llevar por nombre el mismo que llega
	// como parámetro de GETMAPPING
	@GetMapping("{id}")
	private ResponseEntity<List<State>> getAllStatesByCountry(@PathVariable("id") long idCountry) {
		return ResponseEntity.ok(stateService.findByCountry(idCountry));
	}
}
