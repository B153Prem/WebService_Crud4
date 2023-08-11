package com.cjc.web.crud.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id
	private int eId;
	private String eName;
	private String eAddress;
	private long eMobno;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddress() {
		return eAddress;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	public long geteMobno() {
		return eMobno;
	}
	public void seteMobno(long eMobno) {
		this.eMobno = eMobno;
	}
	


	
	
	

}
