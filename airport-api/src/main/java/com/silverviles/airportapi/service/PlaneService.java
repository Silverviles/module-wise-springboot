package com.silverviles.airportapi.service;

import org.springframework.stereotype.Service;

import com.silverviles.airportcore.model.PlaneDTO;

@Service
public class PlaneService {
	public PlaneDTO getPlane(){
		return new PlaneDTO("Jet", 5);
	}
}
