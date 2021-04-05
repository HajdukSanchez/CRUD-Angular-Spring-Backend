/**
 * 
 */
package com.example.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.person.model.State;

/**
 * Esta interface cuando sea llamada va a permitir implementar nuestros própios
 * métodos y los que viene en JPARepository
 * 
 * @author Jozek Andrzej Hajduk Sánchez
 *
 */
public interface StateRepository extends JpaRepository<State, Long> {

}
