package com.hmis.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="Health_1")
public class Admission {
	
	@Transient
	public static final String  idgen="admid_seq";

	@Id
	private int admId;
	private int hid;
	private String name;
	private int deptId;
	private int unitId;
	private int wardId;
	private int bedId;
	public Admission(int admId, int hid, String name, int deptId, int unitId, int wardId, int bedId) {
		super();
		this.admId = admId;
		this.hid = hid;
		this.name = name;
		this.deptId = deptId;
		this.unitId = unitId;
		this.wardId = wardId;
		this.bedId = bedId;
	}
	public Admission() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admission [admId=" + admId + ", hid=" + hid + ", name=" + name + ", deptId=" + deptId + ", unitId="
				+ unitId + ", wardId=" + wardId + ", bedId=" + bedId + "]";
	}
	public int getAdmId() {
		return admId;
	}
	public void setAdmId(int admId) {
		this.admId = admId;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getWardId() {
		return wardId;
	}
	public void setWardId(int wardId) {
		this.wardId = wardId;
	}
	public int getBedId() {
		return bedId;
	}
	public void setBedId(int bedId) {
		this.bedId = bedId;
	}
	public static String getIdgen() {
		return idgen;
	}
	
	
}
