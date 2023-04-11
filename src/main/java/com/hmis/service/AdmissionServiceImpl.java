package com.hmis.service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.hmis.dao.AdmissionRepo;
import com.hmis.dao.BedRepo;
import com.hmis.domain.Admission;
import com.hmis.domain.Bed;
import com.hmis.domain.Registration;
import com.hmis.domain.Status;


@Service
public class AdmissionServiceImpl implements AdmissionService {
	
	@Autowired
	AdmissionRepo  repo;
	
	@Autowired
	BedRepo bedrepo;
	
	@Autowired
	NextSeqService seq;
	
	@Autowired
	MongoOperations mongoOperations;


	@Override
	public List<Admission> getAdmissions() {
		// TODO Auto-generated method stub

		return repo.findAll();
	}

	@Override
	public Admission getAdmissionById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveAdmission(Admission adm) {
		
		adm.setAdmId(seq.getNextSequence(Admission.idgen));
		
		repo.save(adm);
		
		
		Query query=new Query().addCriteria(Criteria.where("bedid").is(adm.getBedId()));
		Update updateDef=new Update().set("vacant", 0);
		FindAndModifyOptions options= options().returnNew(true).upsert(true);
		
		mongoOperations.findAndModify(query,updateDef,options,Bed.class);
		
		Query query2=new Query().addCriteria(Criteria.where("hid").is(adm.getHid()));
		Update updateDef2=new Update().set("patStatus", Status.IPD);
		FindAndModifyOptions options2= options().returnNew(true).upsert(true);
		
		mongoOperations.findAndModify(query2,updateDef2,options2,Registration.class);
		
		return true;
		
	}

	@Override
	public boolean updateAdmission(Admission adm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAdmission(Admission adm) {
		// TODO Auto-generated method stub
		return false;
	}
	

	
	
}
