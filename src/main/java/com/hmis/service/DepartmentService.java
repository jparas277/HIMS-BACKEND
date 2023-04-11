package com.hmis.service;

import java.util.List;

import com.hmis.domain.Department;

public interface DepartmentService {
	
	public List<Department> getDepartments();
	
	public Department getDepartment(int id);

	public void saveDepartment(Department dept);

}

