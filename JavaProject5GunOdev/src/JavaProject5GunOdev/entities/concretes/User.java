package JavaProject5GunOdev.entities.concretes;

import JavaProject5GunOdev.entities.abstracts.Entity;

public class User implements Entity {

	private int id;
	private String name;
	private String lastName;
	private String email;
	private String parola;
	
	public User() {
		
	}

	public User(int id, String name, String lastName, String email, String parola) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.parola = parola;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}
	
	
}
