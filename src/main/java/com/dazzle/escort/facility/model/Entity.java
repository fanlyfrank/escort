package com.dazzle.escort.facility.model;

import java.io.Serializable;
import java.util.Date;


/**
 * @author trgoofi
 */
public abstract class Entity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
    private Date createdAt;
    private Date updatedAt;


    @Override
    public String toString() {
        String format = "{\"id\": \"%s\"}";
        return String.format(format, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity)) return false;

        Entity entity = (Entity) o;

        return getId().equals(entity.getId());

    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
