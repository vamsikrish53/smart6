package com.project.smart6.service;

import java.util.List;

import com.project.smart6.model.IPLPlayer;
import com.project.smart6.model.IPLSchedule;


public interface IPLPlayerService {
	
	public List<IPLPlayer> getAllIPLPLayersByTeam(String iplTeam1, String iplTeam2);

	public List<IPLSchedule> getIplSchedule();
}
