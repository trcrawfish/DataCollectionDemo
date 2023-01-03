package com.trc.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Table(name = "numeric_readings")
@Entity
@XmlRootElement
public class NumericReading extends Reading {

	@Basic
	private Double value;

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
