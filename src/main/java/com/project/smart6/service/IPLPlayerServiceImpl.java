package com.project.smart6.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.smart6.model.IPLPlayer;
import com.project.smart6.model.IPLSchedule;
import com.project.smart6.repository.IPLPlayerRepository;


@Service
public class IPLPlayerServiceImpl implements IPLPlayerService {

	@Autowired
	private IPLPlayerRepository iplPlayerRepository;

	@Override
	public List<IPLPlayer> getAllIPLPLayersByTeam(String iplTeam1, String iplTeam2) 
	{
		List<IPLPlayer> iplPlayers = iplPlayerRepository.findAllPlayersByTeam(iplTeam1,iplTeam2);
		return iplPlayers;
	}

	@Override
	public List<IPLSchedule> getIplSchedule() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String todayDate = dateFormat.format(date);
		List<IPLSchedule> iplSchedule = iplPlayerRepository.getIplSchedule(todayDate);
		return iplSchedule;
	}

}
