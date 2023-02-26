package com.app.departmentservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, String>{
	Optional<Department> findByDepartmentCode(String departmentCode);
}
