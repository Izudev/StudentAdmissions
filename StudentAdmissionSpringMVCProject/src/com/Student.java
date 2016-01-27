package com;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
    @Pattern(regexp="[^0-9]*")
	private String studentName;
	
	@Size (min=2,max=30)
	private String studentHobby;
	
	//@Min(2000)
	@Max(8800)
	private long studentMobile; // constraint applied so that it does not display.
	
	@NotNull
	@Past
	private Date birthDate;
	@NotNull
	private Address address;
	
	private ArrayList<String>skillSets;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public ArrayList<String> getSkillSets() {
		return skillSets;
	}
	public void setSkillSets(ArrayList<String> skillSets) {
		this.skillSets = skillSets;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	

}
