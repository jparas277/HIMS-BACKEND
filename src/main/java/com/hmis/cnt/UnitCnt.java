package com.hmis.cnt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmis.domain.Unit;
import com.hmis.service.UnitService;

@RestController
@CrossOrigin("*")
public class UnitCnt {
	
	
	@Autowired
	UnitService serv;

	
	@GetMapping("/getUnits")
	public List<Unit> getUnits() {
		return serv.getUnits();
	}
	
	@GetMapping("/getUnit/{id}")
	public Unit getDepartment(@PathVariable int id) {
		return serv.getUnit(id);
	}
	
	@GetMapping("/getUnitByDept/{id}")
	public List<Unit> getUnitByDept(@PathVariable int id) {
		return serv.getUnitByDept(id);
	}
	
	@PostMapping("/saveUnit")
	public boolean saveUnit(@RequestBody Unit unit) {
		serv.saveUnit(unit);
		return true;
	}
	
}

