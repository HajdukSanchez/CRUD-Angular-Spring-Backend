/**
 * 
 */
package com.example.person.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.person.model.State;
import com.example.person.repository.StateRepository;

/**
 * Implementa todos los métodos de la interface a la que se "conecta"
 * 
 * @author Jozek Andrzej Hajduk Sánchez
 *
 */

//Se le indica a Spring cuales clases son de servicio
@Service
public class StateService implements StateRepository {

	// Se obtiene todos los métodos pues STATEREPOSITORY extiende de JPAREPOSITORY
	// el cual posee todos estos métodos

	// El autoWired permite utilizar el elemento sin la necesidad de crear una
	// instancia
	@Autowired
	private StateRepository stateRepository;

	@Override
	public List<State> findAll() {
		return stateRepository.findAll();
	}

	@Override
	public List<State> findAll(Sort sort) {
		return stateRepository.findAll(sort);
	}

	/**
	 * Method for get states by an specific country
	 * 
	 * @param idCountry
	 * @return List of states for an specific country
	 */
	public List<State> findByCountry(long idCountry) {
		List<State> stateResponse = new ArrayList<State>(); // Returned list
		List<State> states = stateRepository.findAll(); // Auxiliar list
		for (State state : states) {
			if (state.getCountry().getId() == idCountry) {
				stateResponse.add(state);
			}
		}
		return stateResponse;
	}

	@Override
	public List<State> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends State> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends State> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<State> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public State getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends State> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends State> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<State> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends State> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<State> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(State entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends State> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends State> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends State> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends State> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends State> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
