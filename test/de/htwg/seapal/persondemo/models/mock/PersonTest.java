package de.htwg.seapal.persondemo.models.mock;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.htwg.seapal.persondemo.models.mock.Person;

public class PersonTest {
	
	private Person person;

	@Before
	public void setup(){
		person = new Person();	
	}

	@Test
	public void testGetName() {
		assertEquals("Mustermann", person.getName());
	}

}
