package com.hmis.cnt;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmis.domain.Bed;
import com.hmis.service.BedService;
import com.hmis.service.WardService;

@RestController
@CrossOrigin("*")
public class BedCnt {
	
	@Autowired
	BedService serv;
	
	@GetMapping("/getBeds")
	public List<Bed> getBeds(){
		return serv.getBeds();
	}

	
	@GetMapping("/getBedByWard/{id}")
	public List<Bed> getBedByWard(@PathVariable int id) {
		return serv.getBedByWard(id);
	}

	@PostMapping("/saveBed")
	public boolean saveBed(@RequestBody Bed bed) {
		serv.saveBed(bed);
		return true;
	}
	
	@PostMapping("/updateBed")
	public boolean updateBed(@RequestBody String id) {
		serv.updateBed(id);
		return true;
	}
	
	@GetMapping("/getBedCount")
	public Map<String, Integer> getBedCount(){
		
		List<Bed> beds=serv.getBeds();
		
		  Map<String,Integer> bedSizeDetails= new HashMap<>();
		  bedSizeDetails.put("totalBeds", beds.size()) ;
		  bedSizeDetails.put("vaccnatBeds", (int) beds.stream().filter(a->a.getVaccant()==1).count()) ;
		  bedSizeDetails.put("occupiedBeds", (int) beds.stream().filter(a->a.getVaccant()==0).count()) ;
		 
		 return bedSizeDetails;
	}
	
	@GetMapping("/getBedCountByWard/{id}")
	public Map<String, Integer> getBedCountByWard(@PathVariable int id){
		
		List<Bed> beds=serv.getBedByDept(id);
		
		  Map<String,Integer> bedSizeDetails= new HashMap<>();
		  bedSizeDetails.put("totalBeds", beds.size()) ;
		  bedSizeDetails.put("vaccnatBeds", (int) beds.stream().filter(a->a.getVaccant()==1).count()) ;
		  bedSizeDetails.put("occupiedBeds", (int) beds.stream().filter(a->a.getVaccant()==0).count()) ;
		 
		 return bedSizeDetails;
	}
	
}

