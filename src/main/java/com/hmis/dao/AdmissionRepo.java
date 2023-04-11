package com.hmis.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hmis.domain.Admission;

@Repository
public interface AdmissionRepo extends MongoRepository<Admission, Object> {
	
	public Admission findByBedId(int id);
}
