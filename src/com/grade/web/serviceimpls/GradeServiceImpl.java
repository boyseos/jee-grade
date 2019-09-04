package com.grade.web.serviceimpls;

import java.util.ArrayList;
import java.util.List;

import com.grade.web.daoimpls.GradeDaoImpl;
import com.grade.web.daos.GradeDao;
import com.grade.web.domains.GradeBean;
import com.grade.web.services.GradeService;

public class GradeServiceImpl implements GradeService{
	GradeDao dao;
	
	public GradeServiceImpl() {
		dao = new GradeDaoImpl();
	}
	
	@Override
	public void join(GradeBean param) {
		createClass(param);
		while(existClass(param)) {
			createClass(param);
		}
		dao.insertGrade(param);
	}

	@Override
	public void createClass(GradeBean param) {
//		param.setHakbun(String.format("%s-%s%03d"
//				,param.getYear()
//				,genderCheck(param.getSsn())
//				, (int)(Math.random()*999)));
	}

	@Override
	public String genderCheck(String param) {
		return param.split("-")[1].substring(0,1);
	}

	@Override
	public boolean existClass(GradeBean param) {
		boolean result = false;
		List<GradeBean> arr = dao.getfile();
//		for(GradeBean temp : arr) {
//			if(param.getHakbun().equals(temp.getHakbun())) {
//				result = true;
//				break;
//			}
//		}
		return result;
	}

	@Override
	public String grading(GradeBean param) {
		return Integer.parseInt(param.getEng())
				+Integer.parseInt(param.getKor())
				+Integer.parseInt(param.getMath())
				+Integer.parseInt(param.getSocial())+"";
	}

}
