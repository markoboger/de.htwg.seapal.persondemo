package models;

import models.IPerson;

public abstract class AbstractPerson implements IPerson{

	protected String name="n.a.";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getOwnedBoatNameByID(int id) {
		return Integer.toString(id);
	}
	
}
