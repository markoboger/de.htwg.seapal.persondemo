package models;

public interface IPerson {
	
	String getName();
	void setName(String name);
	
	String getOwnedBoatNameByID(int id);
	
	int createOwnedBoat(String name);

}
