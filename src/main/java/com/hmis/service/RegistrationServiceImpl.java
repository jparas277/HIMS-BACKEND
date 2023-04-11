package com.hmis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmis.dao.RegistrationRepo;
import com.hmis.domain.Registration;


@Service
public class RegistrationServiceImpl implements RegistrationService{

	
	@Autowired
	RegistrationRepo repo;
	
	@Autowired
	NextSeqService seq;
	
	@Override
	public List<Registration> getAllPatient() {
		
		List<Registration> list = repo.findAll().stream().toList();
		return list;
	}

	@Override
	public Registration getPatientByHid(int hid) {
		// TODO Auto-generated method stub
		return repo.findByHid(hid);
	}

	@Override
	public boolean savePatient(Registration reg) {
		
		try {
			reg.setHid(seq.getNextSequence(Registration.idgen));
			repo.save(reg);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updatePatient(Registration reg) {
		// TODO Auto-generated method stub
		System.out.println(reg);
		repo.delete(repo.findByHid(reg.getHid()));
		repo.save(reg);
		return true;
	}

	@Override
	public boolean deletePatient(Registration reg) {
		// TODO Auto-generated method stub
		repo.delete(repo.findByHid(reg.getHid()));
		reg.setIsvalid(false);
		repo.save(reg);
		return true;
	}
	
}
