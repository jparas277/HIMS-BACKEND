package com.hmis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmis.dao.BedRepo;
import com.hmis.domain.Bed;

@Service
public class BedSeviceImpl implements BedService{
	
	@Autowired
	NextSeqService seq;
	
	@Autowired
	BedRepo repo;

	@Override
	public boolean saveBed(Bed bed) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=bed.getBedCount();i++) { 
			bed.setBedId(bed.getDeptId()+""+bed.getUnitId()+""+bed.getWardId()+""+i);
			bed.setBedName("BED-"+i);
			repo.save(bed);
		}
	return true;
	}

	@Override
	public List<Bed> getBedByWard(int wardId) {
		// TODO Auto-generated method stub
		List<Bed> list = repo.findByWardId(wardId).stream().filter(x -> x.getVaccant()==1).toList();
		return list;
	}

	@Override
	public boolean updateBed(String id) {
		// TODO Auto-generated method stub
		Bed bed = repo.findById(id.substring(0,id.length()-1)).get();
		repo.delete(bed);
		bed.setVaccant(0);
		repo.save(bed);
		return true;
	}

	@Override
	public List<Bed> getBeds() {
		return repo.findAll();
	}

	@Override
	public List<Bed> getBedByDept(int deptId) {
		// TODO Auto-generated method stub
		return repo.findByDeptId(deptId);
	}

}
