package com.hmis.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection="Health_5")
public class Ward {
	
	@Transient
	public static final String  idgen="wardid_seq";

	@Id
	private int wardId;
	private int deptId;
	private int unitId;
	private String wardName;
	
	@Transient
	private List<Bed> beds;

	public Ward(int wardId, int deptId, int unitId, String wardName, List<Bed> beds) {
		super();
		this.wardId = wardId;
		this.deptId = deptId;
		this.unitId = unitId;
		this.wardName = wardName;
		this.beds = beds;
	}

	@Override
	public String toString() {
		return "Ward [wardId=" + wardId + ", deptId=" + deptId + ", unitId=" + unitId + ", wardName=" + wardName
				+ ", beds=" + beds + "]";
	}

	public int getWardId() {
		return wardId;
	}

	public void setWardId(int wardId) {
		this.wardId = wardId;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public int getUnitId() {
		return unitId;
	}

	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public List<Bed> getBeds() {
		return beds;
	}

	public void setBeds(List<Bed> beds) {
		this.beds = beds;
	}

	public static String getIdgen() {
		return idgen;
	}
	
	
}
