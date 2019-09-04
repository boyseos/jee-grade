package com.grade.web.daoimpls;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.grade.web.daos.GradeDao;
import com.grade.web.domains.GradeBean;
import com.grade.web.pool.Constants;

public class GradeDaoImpl implements GradeDao{
	
	@Override
	public void insertGrade(GradeBean param) {
		try {
			File file = new File(Constants.SETFILE_PATH+"grades.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(String.format("국어 = "+param.getKor() +"\n"
					+ "영어 = "+param.getEng() +"\n"
					+ "수학 = "+param.getMath() +"\n"
					+ "사회 = "+param.getSocial() +"\n"));
			writer.flush();
			writer.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public List<GradeBean> getfile() {
		List<GradeBean> arr = new ArrayList<GradeBean>();
		try {
			File file = new File(Constants.SETFILE_PATH+"grades.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			int count = 0;
			String result ="";
			GradeBean gb = null;
			while((result = reader.readLine()) != null) {
				result = result.split(" = ")[1];
				count++;
				switch(count%7) {
				case 1:
					gb = new GradeBean();
					break;
				case 2:
					break;
				case 3:
					gb.setKor(result);
					break;
				case 4:
					gb.setEng(result);
					break;
				case 5:
					gb.setMath(result);
					break;
				case 6:
					gb.setSocial(result);
					break;
				case 0:
					arr.add(gb);
					break;
				}
			}
			reader.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return arr;
		
	}

}
