/**
 * 
 */
package com.project.smart6.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author krish
 *
 */
@Entity
@Table(name = "ipl_schedule")
public class IPLSchedule {
	@Id
	public int id;
	
	public String match_no;
	
	public String match_date_time;
	
	public String team1_id;
	
	public String team1_name;
	
	public String team2_id;
	
	public String team2_name;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the match_no
	 */
	public String getMatch_no() {
		return match_no;
	}

	/**
	 * @param match_no the match_no to set
	 */
	public void setMatch_no(String match_no) {
		this.match_no = match_no;
	}

	/**
	 * @return the match_date_time
	 */
	public String getMatch_date_time() {
		return match_date_time;
	}

	/**
	 * @param match_date_time the match_date_time to set
	 */
	public void setMatch_date_time(String match_date_time) {
		this.match_date_time = match_date_time;
	}

	/**
	 * @return the team1_id
	 */
	public String getTeam1_id() {
		return team1_id;
	}

	/**
	 * @param team1_id the team1_id to set
	 */
	public void setTeam1_id(String team1_id) {
		this.team1_id = team1_id;
	}

	/**
	 * @return the team1_name
	 */
	public String getTeam1_name() {
		return team1_name;
	}

	/**
	 * @param team1_name the team1_name to set
	 */
	public void setTeam1_name(String team1_name) {
		this.team1_name = team1_name;
	}

	/**
	 * @return the team2_id
	 */
	public String getTeam2_id() {
		return team2_id;
	}

	/**
	 * @param team2_id the team2_id to set
	 */
	public void setTeam2_id(String team2_id) {
		this.team2_id = team2_id;
	}

	/**
	 * @return the team2_name
	 */
	public String getTeam2_name() {
		return team2_name;
	}

	/**
	 * @param team2_name the team2_name to set
	 */
	public void setTeam2_name(String team2_name) {
		this.team2_name = team2_name;
	}

}
