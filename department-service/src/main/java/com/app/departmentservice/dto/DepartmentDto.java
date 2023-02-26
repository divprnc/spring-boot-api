package com.app.departmentservice.dto;

import jakarta.validation.constraints.NotEmpty;

public class DepartmentDto {
	private String id;
	@NotEmpty(message = "Department Name should not be null or empty")
	private String departmentName;
	@NotEmpty(message = "Description should not be null or empty")
	private String departmentDescription;
	@NotEmpty(message = "Department Code should not be null or empty")
	private String departmentCode;

	public DepartmentDto() {
		super();
	}

	public DepartmentDto(String id, String departmentName, String departmentDescription, String departmentCode) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentDescription = departmentDescription;
		this.departmentCode = departmentCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
}
