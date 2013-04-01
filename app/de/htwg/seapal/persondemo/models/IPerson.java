package de.htwg.seapal.persondemo.models;

public interface IPerson {
	
	String getName();
	void setName(String name);
	
	String getOwnedBoatNameByID(int id);
	
	int createOwnedBoat(String name);

}
