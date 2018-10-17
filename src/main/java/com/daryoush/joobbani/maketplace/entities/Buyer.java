package com.daryoush.joobbani.maketplace.entities;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Buyer extends AbstractMarketplace {
	
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String email;
//	@OneToMany(mappedBy="buyer", fetch=FetchType.EAGER,orphanRemoval=true)
//	private Set<Bid> bids;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public Set<Bid> getBids() {
//		return bids;
//	}
//
//	public void setBids(Set<Bid> bids) {
//		this.bids = bids;
//	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(id, ((Buyer)obj).id);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash();
	}
}
