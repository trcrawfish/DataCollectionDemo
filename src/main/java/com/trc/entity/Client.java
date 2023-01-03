package com.trc.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(name = "Clients")
@Entity
public class Client extends AbstractEntity {

	@Basic
	private String name;

	@Basic
	private String description;

	@ManyToMany
	@JoinTable(
			name = "client_user",
			joinColumns = @JoinColumn(name = "clientId"),
			inverseJoinColumns = @JoinColumn(name = "userId"))
	private Set<User> users = new HashSet<User>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
