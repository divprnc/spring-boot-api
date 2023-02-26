package com.app.organisationservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.app.organisationservice.entity.Organisation;

public interface OrganisationRepository extends JpaRepository<Organisation, String>{
	Organisation findByOrganisationCode(String OrganisationCode);
}
