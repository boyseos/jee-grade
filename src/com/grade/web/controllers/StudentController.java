package com.grade.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grade.web.domains.StudentBean;
import com.grade.web.pool.Constants;

@WebServlet("/student.do")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentBean member = new StudentBean();
		String dest = "";
		switch (request.getParameter("action")) {
		case "move":
			dest = String.format(Constants.VIEW_PATH,"student",request.getParameter("dest"));
			break;
		case "join":
			dest = String.format(Constants.VIEW_PATH,"student","login");
			break;
		case "login":
			dest = "index.jsp";
			break;
		}
		request.getRequestDispatcher(dest).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
