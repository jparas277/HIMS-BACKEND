package com.hmis.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection="Health_3")
public class Registration {
	
	@Transient
	public static final String  idgen="hid_seq";
	
	@Id
	private String id;
	private int hid;
    private String fname;
    private String mname;
    private String lname;
    private Date dob;
    private String gender;
    private String marital_status;
    private String father_name;
    private String mother_name;
    private long phone;
    private String email;
    private String address;
    private String city;
    private int pincode;
    private String state;
    private String country;
    private String caste;
    private String department;
    private String unit;
    private String insured;
    private String reg_mode;
    private boolean isvalid=true;
    private Status patStatus = Status.OPD;
    private int update_id;
    private String create_time;
    private String ip;
    private String mac;
	public Registration(String id, int hid, String fname, String mname, String lname, Date dob, String gender,
			String marital_status, String father_name, String mother_name, long phone, String email, String address,
			String city, int pincode, String state, String country, String caste, String department, String unit,
			String insured, String reg_mode, boolean isvalid, Status patStatus, int update_id, String create_time,
			String ip, String mac) {
		super();
		this.id = id;
		this.hid = hid;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.dob = dob;
		this.gender = gender;
		this.marital_status = marital_status;
		this.father_name = father_name;
		this.mother_name = mother_name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
		this.caste = caste;
		this.department = department;
		this.unit = unit;
		this.insured = insured;
		this.reg_mode = reg_mode;
		this.isvalid = isvalid;
		this.patStatus = patStatus;
		this.update_id = update_id;
		this.create_time = create_time;
		this.ip = ip;
		this.mac = mac;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", hid=" + hid + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname
				+ ", dob=" + dob + ", gender=" + gender + ", marital_status=" + marital_status + ", father_name="
				+ father_name + ", mother_name=" + mother_name + ", phone=" + phone + ", email=" + email + ", address="
				+ address + ", city=" + city + ", pincode=" + pincode + ", state=" + state + ", country=" + country
				+ ", caste=" + caste + ", department=" + department + ", unit=" + unit + ", insured=" + insured
				+ ", reg_mode=" + reg_mode + ", isvalid=" + isvalid + ", patStatus=" + patStatus + ", update_id="
				+ update_id + ", create_time=" + create_time + ", ip=" + ip + ", mac=" + mac + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getInsured() {
		return insured;
	}
	public void setInsured(String insured) {
		this.insured = insured;
	}
	public String getReg_mode() {
		return reg_mode;
	}
	public void setReg_mode(String reg_mode) {
		this.reg_mode = reg_mode;
	}
	public boolean isIsvalid() {
		return isvalid;
	}
	public void setIsvalid(boolean isvalid) {
		this.isvalid = isvalid;
	}
	public Status getPatStatus() {
		return patStatus;
	}
	public void setPatStatus(Status patStatus) {
		this.patStatus = patStatus;
	}
	public int getUpdate_id() {
		return update_id;
	}
	public void setUpdate_id(int update_id) {
		this.update_id = update_id;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public static String getIdgen() {
		return idgen;
	}
	public Registration() {
		super();
	}
    
    
	    
}
