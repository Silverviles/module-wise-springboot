package com.silverviles.airportapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silverviles.airportapi.service.PlaneService;
import com.silverviles.airportcore.model.PlaneDTO;

@RestController
@RequestMapping(value = "/api")
public class PlaneController {
	@Autowired
	private PlaneService planeService;

	@RequestMapping(value = "/planes")
	public ResponseEntity<PlaneDTO> getPlane(){
		return ResponseEntity.ok(planeService.getPlane());
	}
}
