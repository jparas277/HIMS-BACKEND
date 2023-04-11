package com.hmis.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="Health_4")
public class Unit {
	
	@Transient
	public static final String  idgen="unitid_seq";

	@Id
	private int unitId;
	private int deptId;
	private String unitName;
	
	@Transient
	private List<Ward> wards;

	public Unit(int unitId, int deptId, String unitName, List<Ward> wards) {
		super();
		this.unitId = unitId;
		this.deptId = deptId;
		this.unitName = unitName;
		this.wards = wards;
	}

	@Override
	public String toString() {
		return "Unit [unitId=" + unitId + ", deptId=" + deptId + ", unitName=" + unitName + ", wards=" + wards + "]";
	}

	public int getUnitId() {
		return unitId;
	}

	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public List<Ward> getWards() {
		return wards;
	}

	public void setWards(List<Ward> wards) {
		this.wards = wards;
	}

	public static String getIdgen() {
		return idgen;
	}
	
	
}
