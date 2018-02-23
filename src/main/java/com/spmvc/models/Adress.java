/**
 * 
 */
package com.spmvc.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author koria
 *
 */
@Entity
@Table(name="adresses")
public class Adress {	
	@Id
	private Long id;
	private String town;
	private String street;
	@Column(name="created_at")
	private Date creation;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}
	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the creation
	 */
	public Date getCreation() {
		return creation;
	}
	/**
	 * @param creation the creation to set
	 */
	public void setCreation(Date creation) {
		this.creation = creation;
	}


}
