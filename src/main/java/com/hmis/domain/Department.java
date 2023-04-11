package com.hmis.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection="Health_3")
public class Department {
	
	@Transient
	public static final String  idgen="deptid_seq";

	@Id
	private int deptId;
	private String deptName;
	
	@Transient
	private List<Unit> units;

	public Department(int deptId, String deptName, List<Unit> units) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.units = units;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", units=" + units + "]";
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Unit> getUnits() {
		return units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}

	public static String getIdgen() {
		return idgen;
	}
	
}
