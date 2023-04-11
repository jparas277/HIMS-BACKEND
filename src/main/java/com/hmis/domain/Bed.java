package com.hmis.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection="Health_2")
public class Bed {
	
	@Transient
	public static final String  idgen="bedid_seq";

	@Id
	private String bedId;
	private int deptId;
	private int unitId;
	private int wardId;
    @Transient
	private int bedCount;
	private String BedName;
	private int vaccant=1;
	
	@Transient
	private Admission adm;

	public Bed(String bedId, int deptId, int unitId, int wardId, int bedCount, String bedName, int vaccant,
			Admission adm) {
		super();
		this.bedId = bedId;
		this.deptId = deptId;
		this.unitId = unitId;
		this.wardId = wardId;
		this.bedCount = bedCount;
		BedName = bedName;
		this.vaccant = vaccant;
		this.adm = adm;
	}

	public Bed() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bed [bedId=" + bedId + ", deptId=" + deptId + ", unitId=" + unitId + ", wardId=" + wardId
				+ ", bedCount=" + bedCount + ", BedName=" + BedName + ", vaccant=" + vaccant + ", adm=" + adm + "]";
	}

	public String getBedId() {
		return bedId;
	}

	public void setBedId(String bedId) {
		this.bedId = bedId;
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

	public int getBedCount() {
		return bedCount;
	}

	public void setBedCount(int bedCount) {
		this.bedCount = bedCount;
	}

	public String getBedName() {
		return BedName;
	}

	public void setBedName(String bedName) {
		BedName = bedName;
	}

	public int getVaccant() {
		return vaccant;
	}

	public void setVaccant(int vaccant) {
		this.vaccant = vaccant;
	}

	public Admission getAdm() {
		return adm;
	}

	public void setAdm(Admission adm) {
		this.adm = adm;
	}

	public static String getIdgen() {
		return idgen;
	}
	
	
}
