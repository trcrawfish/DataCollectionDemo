package com.trc.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;
import java.util.Date;

@Table(name = "seismic_readings")
@Entity
@XmlRootElement
public class SeismicReading extends Reading {

	@Basic
	private String sysid;

	@Basic
	private double mag;

	@Basic
	private String place;

	@Basic
	private Date time;

	@Basic
	private Date updated;

	@Basic
	private String url;

	@Basic
	private String detail;

	@Basic
	private int felt;

	@Basic
	private double cdi;

	@Basic
	private double mmi;

	@Basic
	private String alert;

	@Basic
	private String status;

	@Basic
	private int tsunami;

	@Basic
	private int sig;

	@Basic
	private String net;

	@Basic
	private String code;

	@Basic
	private String ids;

	@Basic
	private String sources;

	@Basic
	private String types;

	@Basic
	private int nst;

	@Basic
	private double dmin;

	@Basic
	private double rms;

	@Basic
	private double gap;

	@Basic
	private String magType;

	@Basic
	private String type;

	@Basic
	private String title;

	@Basic
	private double latitude;

	@Basic
	private double longitude;

	@Basic
	private double depth;

	public String getSysid() {
		return sysid;
	}

	public void setSysid(String sysid) {
		this.sysid = sysid;
	}

	public double getMag() {
		return mag;
	}

	public void setMag(double mag) {
		this.mag = mag;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getFelt() {
		return felt;
	}

	public void setFelt(int felt) {
		this.felt = felt;
	}

	public double getCdi() {
		return cdi;
	}

	public void setCdi(double cdi) {
		this.cdi = cdi;
	}

	public double getMmi() {
		return mmi;
	}

	public void setMmi(double mmi) {
		this.mmi = mmi;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTsunami() {
		return tsunami;
	}

	public void setTsunami(int tsunami) {
		this.tsunami = tsunami;
	}

	public int getSig() {
		return sig;
	}

	public void setSig(int sig) {
		this.sig = sig;
	}

	public String getNet() {
		return net;
	}

	public void setNet(String net) {
		this.net = net;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getSources() {
		return sources;
	}

	public void setSources(String sources) {
		this.sources = sources;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public int getNst() {
		return nst;
	}

	public void setNst(int nst) {
		this.nst = nst;
	}

	public double getDmin() {
		return dmin;
	}

	public void setDmin(double dmin) {
		this.dmin = dmin;
	}

	public double getRms() {
		return rms;
	}

	public void setRms(double rms) {
		this.rms = rms;
	}

	public double getGap() {
		return gap;
	}

	public void setGap(double gap) {
		this.gap = gap;
	}

	public String getMagType() {
		return magType;
	}

	public void setMagType(String magType) {
		this.magType = magType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
}
