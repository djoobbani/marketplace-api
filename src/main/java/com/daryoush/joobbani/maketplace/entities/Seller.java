package com.daryoush.joobbani.maketplace.entities;

import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Seller extends AbstractMarketplace {
	
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String streetAddress;
	@Column(nullable=false)
	private String streetAddress2;
	@Column(nullable=false)
	private String city;
	@Column(nullable=false)
	private String state;
	@Column(name="zipcode",nullable=false)
	private String zipCode;
	@Column(nullable=false)
	private String email;
	@OneToMany(mappedBy = "seller")
	private Set<Project> projects;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getStreetAddress2() {
		return streetAddress2;
	}

	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return Objects.equals(id, ((Seller)obj).id);
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash();
	}
	
}
