package com.trc.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(name = "Users")
@Entity
public class User extends AbstractEntity {

	@Basic
	private String userName;

	@Basic
	private String password;

	@Basic
	private String firstName;

	@Basic
	private String lastName;

	@Basic
	private String email;

	@ManyToMany(mappedBy = "users")
	Set<Client> clients = new HashSet<Client>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
}

