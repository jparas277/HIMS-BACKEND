package com.hmis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmis.dao.UnitRepo;
import com.hmis.domain.Unit;

@Service
public class UnitServiceImpl implements UnitService{
	@Autowired
	NextSeqService seq;
	
	@Autowired
	UnitRepo repo;

	@Override
	public List<Unit> getUnits() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Unit getUnit(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
	
	@Override
	public List<Unit> getUnitByDept(int deptId){
		return repo.findByDeptId(deptId);
	}

	@Override
	public void saveUnit(Unit unit) {
		// TODO Auto-generated method stub
		unit.setUnitId(seq.getNextSequence(Unit.idgen));
	    System.out.println(unit);
		repo.save(unit);
	}


}
