package com.hmis.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hmis.domain.Department;
@Repository
public interface DepartmentRepo extends MongoRepository<Department, Object>{
	
	
}
