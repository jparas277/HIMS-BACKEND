package com.hmis.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hmis.domain.Bed;

@Repository
public interface BedRepo extends MongoRepository<Bed, String> {

	public List<Bed> findByWardId(int wardId);
	
	public Bed findByBedId(String id);
	
	public List<Bed> findByDeptId(int deptId);
	
}
