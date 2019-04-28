package com.project.smart6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.smart6.model.IPLPlayer;
import com.project.smart6.model.IPLSchedule;
import com.project.smart6.service.IPLService;

@RestController
@RequestMapping("/ipl")
public class IPLController {

	@Autowired
	IPLService iplService;

	@GetMapping("/{iplTeam1}vs{iplTeam2}/players")
	public List<IPLPlayer> playersByTeam(@PathVariable("iplTeam1") String iplTeam1, @PathVariable("iplTeam2") String iplTeam2)
	{
		List<IPLPlayer> iplPlayers = iplService.getAllIPLPLayersByTeam(iplTeam1,iplTeam2); 
		return iplPlayers;
	}
	
	@GetMapping("/schedule")
	public List<IPLSchedule> iplSchedule()
	{
		List<IPLSchedule> iplSchedule = iplService.getIplSchedule();
		return iplSchedule;
	}

}