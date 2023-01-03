package com.trc.service;

import com.trc.entity.Reading;
import com.trc.entity.Sensor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(mappedName = "DataService")
@LocalBean
public class DataService {

	private static Logger logger = LogManager.getLogger(DataService.class);

	@PersistenceContext(unitName = "default")

	protected EntityManager em;

	/* Sensors */

	public Sensor getSensor(Long id) {
		return em.find(Sensor.class, id);
	}

	public Sensor createSensor(Sensor sensor) {
		return em.merge(sensor);
	}

	public Sensor updateSensor(Sensor sensor) {
		return em.merge(sensor);
	}

	public void deleteSensor(long id) {
		em.remove(em.find(Sensor.class, id));
	}

	/* Readings */

	public Reading getReading(Long id) {
		return em.find(Reading.class, id);
	}

	public Reading createReading(Reading reading) {
		return em.merge(reading);
	}

	public Reading updateReading(Reading reading) {
		return em.merge(reading);
	}

	public void deleteReading(Long id) {
		em.remove(em.find(Reading.class, id));
	}
}
