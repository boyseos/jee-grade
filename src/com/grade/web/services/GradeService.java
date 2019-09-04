package com.grade.web.services;

import com.grade.web.domains.GradeBean;

public interface GradeService {
	public void join(GradeBean param);
	public void createClass(GradeBean param);
	public String grading(GradeBean param);
	public String genderCheck(String param);
	public boolean existClass(GradeBean param);	
}
