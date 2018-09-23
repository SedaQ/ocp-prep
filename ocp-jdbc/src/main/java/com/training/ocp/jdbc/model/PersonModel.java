package com.training.ocp.jdbc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.training.ocp.jdbc.dbconnection.DBConnection;
import com.training.ocp.jdbc.dto.PersonDTO;

/**
 * 
 * @author Pavel Seda
 *
 */
public class PersonModel {

	private DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;

	public List<PersonDTO> getAllPersons() {
		Connection conn = DBConnection.getConnection();
		try (Statement statement = conn.createStatement(); ResultSet rs = statement.executeQuery("SELECT * FROM person");) {
			return mapPersonTableToDTO(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public PersonDTO getPersonById(long id) {
		Connection conn = DBConnection.getConnection();
		try (Statement statement = conn.createStatement();
				ResultSet rs = statement.executeQuery("SELECT * FROM person WHERE id_person=" + id);) {
			PersonDTO person = null;
			if (rs.next()) {
				person = mapPersonResultSetToDTO(rs);
			}
			return person;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		throw new NullPointerException("Not person is present");
	}

	public PersonDTO getPersonByIdUsingPreparedStatement(long id) {
		Connection conn = DBConnection.getConnection();
		PreparedStatement prepStatement = null;
		String findByIdString = "SELECT * FROM person WHERE id_person = ?";
		try {
			prepStatement = conn.prepareStatement(findByIdString);
			prepStatement.setLong(1, id);
			ResultSet rs = prepStatement.executeQuery();
			PersonDTO person = null;
			if (rs.next()) {
				person = mapPersonResultSetToDTO(rs);
			}
			return person;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (prepStatement != null) {
				try {
					prepStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		throw new NullPointerException("Not person is present");
	}

	public int createPerson() {
		Connection conn = DBConnection.getConnection();
		try (Statement statement = conn.createStatement();) {
			int affectedRows =
					statement.executeUpdate("INSERT INTO person VALUES (50, 50, 1983-05-25, qweseznam.cz, David, Smeták, myPwd, Kunz)");
			return affectedRows;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updatePersonAge(int personID, int age) {
		Connection conn = DBConnection.getConnection();
		try (Statement statement = conn.createStatement();) {
			int affectedRows = statement.executeUpdate("UPDATE person SET age = " + age + " WHERE id_person = " + personID);
			return affectedRows;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	private List<PersonDTO> mapPersonTableToDTO(ResultSet rs) {
		List<PersonDTO> persons = new ArrayList<>();
		try {
			while (rs.next()) {
				PersonDTO personDTO = mapPersonResultSetToDTO(rs);
				persons.add(personDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return persons;
	}

	private PersonDTO mapPersonResultSetToDTO(ResultSet rs) throws SQLException {
		PersonDTO personDTO = new PersonDTO();
		personDTO.setId(rs.getLong("id_person"));
		personDTO.setAge(rs.getInt("age"));
		personDTO.setBirthday(LocalDate.parse(rs.getString("birthday"), formatter));
		personDTO.setEmail(rs.getString("email"));
		personDTO.setFirstName(rs.getString("first_name"));
		personDTO.setNickName(rs.getString("nickname"));
		personDTO.setSurname(rs.getString("surname"));
		personDTO.setPwd(rs.getString("pwd").toCharArray());
		return personDTO;
	}
}
