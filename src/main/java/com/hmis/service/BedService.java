package com.hmis.service;

import java.util.List;

import com.hmis.domain.Bed;

public interface BedService {

	public boolean saveBed(Bed bed);
	
	public List<Bed> getBedByWard(int wardId);
	
	public List<Bed> getBedByDept(int deptId);
	
	public boolean updateBed(String id);
	
	public List<Bed> getBeds();

}
