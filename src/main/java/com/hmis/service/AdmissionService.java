package com.hmis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hmis.domain.Admission;
public interface AdmissionService {

	public boolean saveAdmission(Admission adm);
	
	public List<Admission> getAdmissions();
	
	public Admission getAdmissionById(int id);
	
	public boolean updateAdmission(Admission adm);
	
	public boolean deleteAdmission(Admission adm);
}
