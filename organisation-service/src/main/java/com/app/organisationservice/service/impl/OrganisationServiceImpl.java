package com.app.organisationservice.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.app.organisationservice.dto.OrganisationDto;
import com.app.organisationservice.entity.Organisation;
import com.app.organisationservice.repository.OrganisationRepository;
import com.app.organisationservice.service.OrganisationService;

@Service
public class OrganisationServiceImpl implements OrganisationService{
	
	private OrganisationRepository organisationRepository;
	private ModelMapper modelMapper;
	

	public OrganisationServiceImpl(OrganisationRepository organisationRepository, ModelMapper modelMapper) {
		super();
		this.organisationRepository = organisationRepository;
		this.modelMapper = modelMapper;
	}


	@Override
	public OrganisationDto saveOrganisation(OrganisationDto organisationDto) {
		// Convert OrganisationDTo into Organization JPA entity
		Organisation organisation = modelMapper.map(organisationDto, Organisation.class);
		Organisation savedOrganisation = organisationRepository.save(organisation);
		OrganisationDto returnDto = modelMapper.map(savedOrganisation, OrganisationDto.class);
		return returnDto;
	}


	@Override
	public OrganisationDto findOrganisationByCode(String organisationCode) {
		Organisation organisation = organisationRepository.findByOrganisationCode(organisationCode);
		OrganisationDto returnDto =  modelMapper.map(organisation, OrganisationDto.class);
		return returnDto;
	}

}
