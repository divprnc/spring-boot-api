package com.app.organisationservice.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;

public class OrganisationDto {
	private String id;
	@NotEmpty(message = "Name should not be empty")
	private String organisationName;
	@NotEmpty(message = "Description should not be empty")
	private String organisationDescription;
	@NotEmpty(message = "code should not be empty")
	private String organisationCode;
	private LocalDateTime createdDate;

	public OrganisationDto() {
		super();
	}

	public OrganisationDto(String id, String organisationName, String organisationDescription, String organisationCode,
			LocalDateTime createdDate) {
		super();
		this.id = id;
		this.organisationName = organisationName;
		this.organisationDescription = organisationDescription;
		this.organisationCode = organisationCode;
		this.createdDate = createdDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public String getOrganisationDescription() {
		return organisationDescription;
	}

	public void setOrganisationDescription(String organisationDescription) {
		this.organisationDescription = organisationDescription;
	}

	public String getOrganisationCode() {
		return organisationCode;
	}

	public void setOrganisationCode(String organisationCode) {
		this.organisationCode = organisationCode;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
}
