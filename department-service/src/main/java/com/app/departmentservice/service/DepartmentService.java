package com.app.departmentservice.service;

import com.app.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
	DepartmentDto saveDepartment(DepartmentDto departmentDto);
	DepartmentDto getDepartmentByDepartmentCode(String code);
}
