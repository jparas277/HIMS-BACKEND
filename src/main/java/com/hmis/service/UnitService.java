package com.hmis.service;

import java.util.List;

import com.hmis.domain.Unit;

public interface UnitService {
	
	public List<Unit> getUnits();
	
	public Unit getUnit(int id);

	public void saveUnit(Unit unit);
	
	public List<Unit> getUnitByDept(int deptId);

}

