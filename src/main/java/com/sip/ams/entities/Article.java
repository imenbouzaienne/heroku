package com.sip.ams.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;



@Entity
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	
    @Column(name = "name")
	private String name;
    
	
	@Column(name = "price")
	private float price;
	
	
	@Column(name="label")
	private String label;
	
	
	
	public Article () {}
	
	public Article(long id,  String name, float price, String label) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.label = label;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "provider_id", nullable = false)
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Provider provider;
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider=provider;

	}
	
	
	


	
}
