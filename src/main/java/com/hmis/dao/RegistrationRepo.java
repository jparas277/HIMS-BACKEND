package com.hmis.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hmis.domain.Registration;
@Repository
public interface RegistrationRepo extends MongoRepository<Registration, Object>{
	
	Registration findByHid(int hid);
	
}
