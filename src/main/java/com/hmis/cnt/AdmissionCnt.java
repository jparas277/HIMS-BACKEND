package com.hmis.cnt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmis.domain.Admission;
import com.hmis.service.AdmissionService;

@RestController
@CrossOrigin("*")
public class AdmissionCnt {
	
	
	@Autowired
	AdmissionService serv;
	
	@PostMapping("/saveAdmission")
	public boolean saveAdmission(@RequestBody Admission adm) {
		serv.saveAdmission(adm);
		return true;
	}
	
}

