package com.project.smart6.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ipl_teams")
public class IPLTeam 
{
	@Id
	private int team_id;

	private String team_name;

	/**
	 * @return the team_id
	 */
	public int getTeam_id() {
		return team_id;
	}

	/**
	 * @param team_id the team_id to set
	 */
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	/**
	 * @return the team_name
	 */
	public String getTeam_name() {
		return team_name;
	}

	/**
	 * @param team_name the team_name to set
	 */
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	
	
}
