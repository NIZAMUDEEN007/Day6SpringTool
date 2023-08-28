package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="child")
public class ChildModel {
	@Id
	private int id;
	private String fbabyname;
	private String lbabyname;
	private String fathername;
	private String mothername;
	private String address;
	public ChildModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChildModel(int id, String fbabyname, String lbabyname, String fathername, String mothername,
			String address) {
		super();
		this.id = id;
		this.fbabyname = fbabyname;
		this.lbabyname = lbabyname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFbabyname() {
		return fbabyname;
	}
	public void setFbabyname(String fbabyname) {
		this.fbabyname = fbabyname;
	}
	public String getLbabyname() {
		return lbabyname;
	}
	public void setLbabyname(String lbabyname) {
		this.lbabyname = lbabyname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
