package com.app.organisationservice.service;

import com.app.organisationservice.dto.OrganisationDto;

public interface OrganisationService {
	OrganisationDto saveOrganisation(OrganisationDto organisationDto);
	OrganisationDto findOrganisationByCode(String organisationCode);
}
