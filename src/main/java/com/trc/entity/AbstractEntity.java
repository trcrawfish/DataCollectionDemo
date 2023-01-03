package com.trc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import static java.time.LocalDateTime.now;

@MappedSuperclass
@EntityListeners(AbstractEntity.AbstractEntityListener.class)
public abstract class AbstractEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;

	@Version
	private int version;

	@Basic
	private Date created;

	@Basic
	private Date modified;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	@Override
	public int hashCode() {
		if (id != 0 ) {
			return id.intValue();
		}
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		AbstractEntity other = (AbstractEntity) obj;
		if (getId() == 0 || other.getId() == 0) {
			return false;
		}
		return getId() == (other.getId());
	}

	public static class AbstractEntityListener {

		@PrePersist
		@PreUpdate
		public void onPrePersist(AbstractEntity entity) {
			entity.setModified(new Date());
		}
	}

}
