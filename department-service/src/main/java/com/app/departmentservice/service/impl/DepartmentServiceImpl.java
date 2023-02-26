package com.app.departmentservice.service.impl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.app.departmentservice.dto.DepartmentDto;
import com.app.departmentservice.entity.Department;
import com.app.departmentservice.exception.ResourceNotFoundException;
import com.app.departmentservice.repository.DepartmentRepository;
import com.app.departmentservice.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentRepository departmentRepository;
	ModelMapper modelMapper;

	public DepartmentServiceImpl(DepartmentRepository departmentRepository, ModelMapper modelMapper) {
		super();
		this.departmentRepository = departmentRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

		// convert department dto to department jpa
		Department department = modelMapper.map(departmentDto, Department.class);
		Department savedDepartment = departmentRepository.save(department);
		DepartmentDto convertedDto = modelMapper.map(savedDepartment, DepartmentDto.class);
		return convertedDto;
	}

	@Override
	public DepartmentDto getDepartmentByDepartmentCode(String code) {
		Optional<Department> department = departmentRepository.findByDepartmentCode(code);
		if (!department.isPresent()) {
			throw new ResourceNotFoundException("Department", "Department Code", code);
		}
		DepartmentDto departmentDto = modelMapper.map(department.get(), DepartmentDto.class);
		return departmentDto;

	}

}
