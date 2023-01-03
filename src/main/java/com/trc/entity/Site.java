package com.trc.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Set;

@Table(name = "sites")
@Entity
@XmlRootElement
public class Site extends AbstractEntity {

	@Basic
	private String name;

	@Basic
	private String description;

	@Basic
	private String alias;

	@Basic
	private double latitude;

	@Basic
	private double longitude;

	@Basic
	private int elevation;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "site", fetch = FetchType.EAGER)
	private Set<Sensor> sensors = new HashSet<>();

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

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getElevation() {
		return elevation;
	}

	public void setElevation(int elevation) {
		this.elevation = elevation;
	}

	public Set<Sensor> getSensors() {
		return sensors;
	}

	public void setSensors(Set<Sensor> sensors) {
		this.sensors = sensors;
	}
}
