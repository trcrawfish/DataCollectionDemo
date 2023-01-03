package com.trc.service;

import com.trc.entity.Reading;
import com.trc.entity.Sensor;

import javax.ejb.Local;

@Local
public interface DataServiceLocal {

	public Sensor getSensor(Long id);
	public Sensor createSensor(Sensor sensor);
	public Sensor updateSensor(Sensor sensor);
	public void deleteSensor(Long id);

	public Reading getReading(Long id);
	public Reading createReading(Reading reading);
	public Reading updateReading(Reading reading);
	public void deleteReading(Long id);

}
