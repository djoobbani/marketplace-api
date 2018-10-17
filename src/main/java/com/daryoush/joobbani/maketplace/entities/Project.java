package com.daryoush.joobbani.maketplace.entities;

import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Project extends AbstractMarketplace {

	private String description;
	private ZonedDateTime bidDeadline;
	private double maxBudget;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(nullable=false,updatable=false,referencedColumnName="ID")
	private Seller seller;
//	@ManyToOne(fetch=FetchType.EAGER)
//	@JoinColumn(nullable=false,updatable=false,referencedColumnName="ID")
//	private Bid bid;
	//@OneToMany(mappedBy="project", fetch=FetchType.EAGER,orphanRemoval=true)
//	@OneToMany(mappedBy="project")
//	private Set<Bid> bids;
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ZonedDateTime getBidDeadline() {
		return bidDeadline;
	}

	public void setBidDeadline(ZonedDateTime bidDeadline) {
		this.bidDeadline = bidDeadline;
	}

	public double getMaxBudget() {
		return maxBudget;
	}

	public void setMaxBudget(double maxBudget) {
		this.maxBudget = maxBudget;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
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
		// TODO Auto-generated method stub
		return Objects.equals(id, ((Project)obj).id);
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash();
	}
	
	
	
}
