package com.project.smart6.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.project.smart6.model.IPLPlayer;
import com.project.smart6.model.IPLSchedule;

@Repository
public interface IPLPlayerRepository extends JpaRepository <IPLPlayer, Long> {
	
	@Query("select u from IPLPlayer u where u.player_team = ?1 OR u.player_team = ?2 ORDER BY u.player_credit DESC")
	public List<IPLPlayer> findAllPlayersByTeam(String iplTeam1, String iplTeam2);
	
	@Query("select u from IPLSchedule u")
	public List<IPLSchedule> getIplSchedule(String todayDate);

}

