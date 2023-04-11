package com.hmis.cnt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmis.domain.Ward;
import com.hmis.service.WardService;

@RestController
@CrossOrigin("*")
public class WardCnt {
	
	
	@Autowired
	WardService serv;

	
	@GetMapping("/getWards")
	public List<Ward> getWards() {
		return serv.getWards();
	}
	
	@GetMapping("/getWard/{id}")
	public Ward getWard(@PathVariable int id) {
		return serv.getWard(id);
	}
	
	@GetMapping("/getWardByUnit/{id}")
	public List<Ward> getWardByUnit(@PathVariable int id) {
		return serv.getWardByUnit(id);
	}
	
	@PostMapping("/saveWard")
	public boolean saveWard(@RequestBody Ward ward) {
		serv.saveWard(ward);
		return true;
	}
	
}

