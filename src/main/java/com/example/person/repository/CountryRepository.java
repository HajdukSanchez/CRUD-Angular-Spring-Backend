/**
 * 
 */
package com.example.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.person.model.Country;

/**
 * Esta interface cuando sea llamada va a permitir implementar nuestros própios
 * métodos y los que viene en JPARepository
 * 
 * @author Jozek Andrzej Hajduk Sánchez
 *
 */
public interface CountryRepository extends JpaRepository<Country, Long> {

}
