package com.app.departmentservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.departmentservice.dto.DepartmentDto;
import com.app.departmentservice.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {
	
	private DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}
	
	// BUILD save department REST API
	@PostMapping
	public ResponseEntity<DepartmentDto> saveDepartment(@Valid @RequestBody DepartmentDto departmentDto) {
		DepartmentDto savedDepartment = departmentService.saveDepartment(departmentDto);
		return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
	}
	
	@GetMapping("{code}")
	public ResponseEntity<DepartmentDto> getDepartmentByCode(@PathVariable String code){
		DepartmentDto department = departmentService.getDepartmentByDepartmentCode(code);
		return new ResponseEntity<>(department, HttpStatus.CREATED);
	}
	
}
