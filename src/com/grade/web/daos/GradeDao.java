package com.grade.web.daos;

import java.util.List;

import com.grade.web.domains.GradeBean;

public interface GradeDao {
	public void insertGrade(GradeBean param);
	public List<GradeBean> getfile();
}
