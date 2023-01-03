package com.trc.entity;

import javax.persistence.*;
import javax.json.bind.annotation.JsonbTransient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Table(name = "sensors")
@Entity
@XmlRootElement
public class Sensor extends AbstractEntity {

	@Basic
	private String description;

	@Basic
	private String alias;

	@ManyToOne
	@JoinColumn(name="site_id", nullable=false)
	private Site site;

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

	@XmlTransient
	@JsonbTransient
	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}
}

