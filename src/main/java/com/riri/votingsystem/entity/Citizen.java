package com.riri.votingsystem.entity;

import javax.persistence.*;

@Table(name="Citizens")
@Entity
public class Citizen {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="citizen_name")
	private String name;

	private Boolean hasVoted;

	public Citizen() {
	}

	public Citizen(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Citizen(Long id, String name, Boolean hasVoted) {
		this.id = id;
		this.name = name;
		this.hasVoted = hasVoted;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Boolean getHasVoted() {
		return hasVoted;
	}

	public void setHasVoted(Boolean hasVoted) {
		this.hasVoted = hasVoted;
	}
}
