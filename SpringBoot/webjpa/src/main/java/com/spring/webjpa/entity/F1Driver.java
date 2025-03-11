package com.spring.webjpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="f1drivers")
public class F1Driver {
	@Id
	@Column(name="Jersey No")
	Integer id;
	@Column(name="Driver Name")
	String name;
	@Column(name="Team Name")
	String team;
	@Column(name="World Championships")
	Integer worldchampionships;
	@Column(name="Country")
	String country;
	@Column(name="Podiums")
	Integer podium;
	public F1Driver(Integer id, String name, String team, Integer worldchampionships, String country, Integer podium) {
		this.id = id;
		this.name = name;
		this.team = team;
		this.worldchampionships = worldchampionships;
		this.country = country;
		this.podium = podium;
	}
	public F1Driver() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Integer getWorldchampionships() {
		return worldchampionships;
	}
	public void setWorldchampionships(Integer worldchampionships) {
		this.worldchampionships = worldchampionships;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPodium() {
		return podium;
	}
	public void setPodium(Integer podium) {
		this.podium = podium;
	}
	@Override
	public String toString() {
		return "F1Driver [id=" + id + ", name=" + name + ", team=" + team + ", worldchampionships=" + worldchampionships
				+ ", country=" + country + ", podium=" + podium + "]";
	}
	
}
