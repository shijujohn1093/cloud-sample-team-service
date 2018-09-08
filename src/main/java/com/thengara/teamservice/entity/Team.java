package com.thengara.teamservice.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Team implements Serializable{
	
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String location;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="team_id")
	private Set<Player> players;

	public Team() {
		super();
	}

	public Team(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}


	public Team(String name, String location, String clubName, Set<Player> players) {
		super();
		this.name = name;
		this.location = location;
		this.players = players;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

}
