package com.hmis.cnt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmis.domain.Table;
import com.hmis.service.TableUpdateService;

@RestController
@CrossOrigin("*")
public class TableUpdateCnt {
	
//	@Autowired
//	TableUpdateService serv;

	@PostMapping("/updateTable")
	public void updateTable(@RequestBody Table table) {
//		serv.updateTable(table);
	}
}
