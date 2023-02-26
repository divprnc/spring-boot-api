package com.app.organisationservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.organisationservice.dto.OrganisationDto;
import com.app.organisationservice.service.OrganisationService;

@RestController
@RequestMapping("api/organisations")
public class OrganisationController {
	private OrganisationService organisationService;

	public OrganisationController(OrganisationService organisationService) {
		super();
		this.organisationService = organisationService;
	}
	
	@PostMapping
	public ResponseEntity<OrganisationDto> saveOrganisation(@RequestBody OrganisationDto organisationDto) {
		OrganisationDto savedOrganisation = organisationService.saveOrganisation(organisationDto);
		return new ResponseEntity<>(savedOrganisation, HttpStatus.CREATED);
	}
	
	@GetMapping("{organisationCode}")
	public ResponseEntity<OrganisationDto> getOrganisation(@PathVariable String organisationCode) {
		OrganisationDto organisationDto = organisationService.findOrganisationByCode(organisationCode);
		return ResponseEntity.ok(organisationDto);
	}
	
}
