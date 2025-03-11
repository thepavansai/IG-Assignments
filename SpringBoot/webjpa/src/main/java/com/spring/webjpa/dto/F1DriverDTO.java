package com.spring.webjpa.dto;

public class F1DriverDTO {
	Integer id;
	String name;
	String team;
	Integer worldchampionships;
	String country;
	Integer podium;
	
	public F1DriverDTO() {
			
		}
	
	public F1DriverDTO(Integer id, String name, String team, Integer worldchampionships, String country,
			Integer podium) {
		this.id = id;
		this.name = name;
		this.team = team;
		this.worldchampionships = worldchampionships;
		this.country = country;
		this.podium = podium;
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
		return "F1Driver [jersey=" + id + ", name=" + name + ", team=" + team + ", worldchampionships="
				+ worldchampionships + ", country=" + country + ", podium=" + podium + "]";
	}
	
	
}
