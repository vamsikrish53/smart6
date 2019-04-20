package com.project.smart6.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * IPL Player Entity
 * @author krish
 *
 */
@Entity
@Table(name = "ipl_players")
public class IPLPlayer {
	
	@Id
	private int player_id;
	
	private String player_name;
	
	private String player_type;
	
	private String player_credit;
	
	private String player_team;
	
	private String player_points;
	
	private int team_id;

	/**
	 * @return the player_id
	 */
	public int getPlayer_id() {
		return player_id;
	}

	/**
	 * @param player_id the player_id to set
	 */
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	/**
	 * @return the player_name
	 */
	public String getPlayer_name() {
		return player_name;
	}

	/**
	 * @param player_name the player_name to set
	 */
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	/**
	 * @return the player_type
	 */
	public String getPlayer_type() {
		return player_type;
	}

	/**
	 * @param player_type the player_type to set
	 */
	public void setPlayer_type(String player_type) {
		this.player_type = player_type;
	}

	/**
	 * @return the player_credit
	 */
	public String getPlayer_credit() {
		return player_credit;
	}

	/**
	 * @param player_credit the player_credit to set
	 */
	public void setPlayer_credit(String player_credit) {
		this.player_credit = player_credit;
	}

	/**
	 * @return the player_team
	 */
	public String getPlayer_team() {
		return player_team;
	}

	/**
	 * @param player_team the player_team to set
	 */
	public void setPlayer_team(String player_team) {
		this.player_team = player_team;
	}

	/**
	 * @return the player_points
	 */
	public String getPlayer_points() {
		return player_points;
	}

	/**
	 * @param player_points the player_points to set
	 */
	public void setPlayer_points(String player_points) {
		this.player_points = player_points;
	}

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
	
	

}
