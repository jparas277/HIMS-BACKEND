package com.hmis.service;

import java.util.List;

import com.hmis.domain.Ward;

public interface WardService {
	
	public List<Ward> getWards();
	
	public Ward getWard(int id);

	public void saveWard(Ward ward);
	
	public List<Ward> getWardByUnit(int unitId);

}

