package com.hmis.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hmis.domain.Unit;

public interface UnitRepo extends MongoRepository<Unit, Object>{
	
	public List<Unit> findByDeptId(int deptId);
}