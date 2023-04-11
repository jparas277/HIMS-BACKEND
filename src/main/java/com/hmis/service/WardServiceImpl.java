package com.hmis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmis.dao.WardRepo;
import com.hmis.domain.Ward;

@Service
public class WardServiceImpl implements WardService{
	
	@Autowired
	NextSeqService seq;
	
	@Autowired
	WardRepo repo;

	@Override
	public List<Ward> getWards() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Ward getWard(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Ward> getWardByUnit(int unitId) {
		// TODO Auto-generated method stub
		return repo.findByUnitId(unitId);
	}

	@Override
	public void saveWard(Ward ward) {
		// TODO Auto-generated method stub
		ward.setWardId(seq.getNextSequence(Ward.idgen));
	    System.out.println(ward);
		repo.save(ward);
	}


}
