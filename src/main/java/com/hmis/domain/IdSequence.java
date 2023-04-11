package com.hmis.domain;

import org.springframework.data.annotation.Id;

import lombok.Data;



public class IdSequence {

	@Id
    private String id;
    private int seq;
	public IdSequence(String id, int seq) {
		super();
		this.id = id;
		this.seq = seq;
	}
	@Override
	public String toString() {
		return "IdSequence [id=" + id + ", seq=" + seq + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
    
	
}
