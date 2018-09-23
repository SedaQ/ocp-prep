package com.training.ocp.jdbc;

import java.util.List;

import com.training.ocp.jdbc.dto.PersonDTO;
import com.training.ocp.jdbc.model.PersonModel;

/**
 * 
 * @author Pavel Seda
 *
 */
public class App {

	public static void main(String[] args) {
		PersonModel pm = new PersonModel();

		PersonDTO personById = pm.getPersonById(4);
		System.out.println(personById);

		PersonDTO personByIdPrepStatement = pm.getPersonByIdUsingPreparedStatement(4);
		System.out.println(personByIdPrepStatement);

		int affectedPersons = pm.updatePersonAge(1, 18);
		System.out.println(affectedPersons);

		List<PersonDTO> person = pm.getAllPersons();
		person.forEach(System.out::println);

	}
}
