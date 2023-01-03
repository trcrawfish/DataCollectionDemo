package com.trc.rest;

import com.trc.entity.*;
import com.trc.service.DataService;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/sensor")
public class SensorResource {

	@EJB
	DataService ds;

	/* Sensors */
	@GET
	@Path("getSensor/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Sensor getSensor(@PathParam("id") final Long id) {
		return ds.getSensor(id);
	}

	@POST
	@Path("createSensor")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Sensor createSensor(Sensor sensor) {
		return (Sensor) ds.createSensor(sensor);
	}

	@PUT
	@Path("updateSensor")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Sensor updateSensor(Sensor sensor) {
		return (Sensor) ds.updateSensor(sensor);
	}

	@DELETE
	@Path("deleteSensor/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteSensor(@PathParam("id") final Long id) {
		ds.deleteSensor(id);
	}

	/* Readings */
	@GET
	@Path("getReading/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Reading getReading(@PathParam("id") final Long id) {
		return ds.getReading(id);
	}

	@DELETE
	@Path("deleteReading/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteReading(@PathParam("id") final Long id) {
		ds.deleteReading(id);
	}

	@POST
	@Path("postNumericReading")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public NumericReading postNumericReading(NumericReading reading) {
		return (NumericReading) ds.createReading(reading);
	}

	@PUT
	@Path("putNumericReading")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public NumericReading putNumericReading(NumericReading reading) {
		return (NumericReading) ds.updateReading(reading);
	}

	@POST
	@Path("postSeismicReading")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public SeismicReading postSeismicReading(SeismicReading reading) {
		return (SeismicReading) ds.createReading(reading);
	}

	@PUT
	@Path("putSeismicReading")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public SeismicReading putSeismicReading(SeismicReading reading) {
		return (SeismicReading) ds.updateReading(reading);
	}

}
