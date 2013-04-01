package models.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoatTest {

	private Person boat;
	
	@Before
	public void setup() {
		boat = new Person();
	}

	@Test
	public void testGetName() {
		boat.setName("Xpresso");
		assertEquals("Xpresso", boat.getName());
	}

}
