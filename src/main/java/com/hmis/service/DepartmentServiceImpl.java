package com.hmis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmis.dao.AdmissionRepo;
import com.hmis.dao.BedRepo;
import com.hmis.dao.DepartmentRepo;
import com.hmis.dao.UnitRepo;
import com.hmis.dao.WardRepo;
import com.hmis.domain.Admission;
import com.hmis.domain.Bed;
import com.hmis.domain.Department;
import com.hmis.domain.Unit;
import com.hmis.domain.Ward;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	NextSeqService seq;
	
	@Autowired
	DepartmentRepo deptRepo;
	
	@Autowired
	UnitRepo unitRepo;
	
	@Autowired
	WardRepo wardRepo;
	
	@Autowired
	BedRepo bedRepo;
	
	@Autowired
	AdmissionRepo admRepo;

	@Override
	public List<Department> getDepartments() {
		// TODO Auto-generated method stub
		List<Department> dept = deptRepo.findAll();
		for(Department d: dept) {
			List<Unit> unit = unitRepo.findByDeptId(d.getDeptId());
			d.setUnits(unit);
			for(Unit u: unit) {
				List<Ward> ward = wardRepo.findByUnitId(u.getUnitId());
				u.setWards(ward);
				for(Ward w: ward) {
					List<Bed> bed = bedRepo.findByWardId(w.getWardId());
					w.setBeds(bed);
					for(Bed b: bed) {
						if(b.getVaccant() == 0) {
							Admission adm = admRepo.findByBedId(Integer.valueOf(b.getBedId()));
							b.setAdm(adm);
						}
					}
				}
			}
		}
		return dept;
	}

	@Override
	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveDepartment(Department dept) {
		// TODO Auto-generated method stub
		dept.setDeptId(seq.getNextSequence(Department.idgen));
	    System.out.println(dept);
	    deptRepo.save(dept);
	}


}
