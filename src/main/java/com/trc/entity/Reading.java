package com.trc.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@XmlRootElement
public abstract class Reading extends AbstractEntity {

	@Basic
	protected int sensorId;
	@Basic
	protected Date readingTime;
	@Basic
	protected Date receiveTime;

	public int getSensorId() {
		return sensorId;
	}

	public void setSensorId(int sensorId) {
		this.sensorId = sensorId;
	}

	public Date getReadingTime() {
		return readingTime;
	}

	public void setReadingTime(Date readingTime) {
		this.readingTime = readingTime;
	}

	public Date getReceiveTime() {
		return receiveTime;
	}

	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}
}
