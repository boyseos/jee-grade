package com.grade.web.domains;

import java.io.Serializable;

public class StudentBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String year,ssn,name,hakbun;
	
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	@Override
	public String toString() {
		return "StudentBean [year=" + year + ", ssn=" + ssn + ", name=" + name + ", hakbun=" + hakbun + "]";
	}

}
