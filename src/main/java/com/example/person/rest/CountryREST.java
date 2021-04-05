/**
 * 
 */
package com.example.person.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.person.model.Country;
import com.example.person.service.CountryService;

/**
 * @author Jozek Andrzej Hajduk Sánchez
 *
 */

//Se le indica que es una REST mediante la cual se va a poder acceder a los servicios que ofrece
@RestController
// Es la URL mediante la cual se va a poder utilizar los servicios de esta clase
@RequestMapping("/country/")
public class CountryREST {

	@Autowired
	private CountryService countryService;

	// Cuando se llame a este método se van a devolver la lista de todos los paises
	// Esta notación nos permite crear mediante peticiones GET externas, una
	// respuesta
	@GetMapping
	private ResponseEntity<List<Country>> getAllCountries() {
		return ResponseEntity.ok(countryService.findAll());
	}

}
