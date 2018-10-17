package com.daryoush.joobbani.maketplace.entities;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



import com.daryoush.joobbani.maketplace.MyOwnException;

@Entity
public class Bid extends AbstractMarketplace {

	@Column(nullable=false)
	private double bidPrice;
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(nullable=true,updatable=false,referencedColumnName="ID")
	private Buyer buyer;
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(nullable=true,updatable=false,referencedColumnName="ID")
	private Project project;
	
	
	public double getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(double bidPrice) throws MyOwnException {
		if (bidPrice < 1) {
			//logger.error("An ERROR Message");
			throw new MyOwnException("Bid price must be a positive value");
		}
		this.bidPrice = bidPrice;
	}

	public Buyer getBuyer() {
		return buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return Objects.equals(id, ((Bid)obj).id);
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash();
	}
}
