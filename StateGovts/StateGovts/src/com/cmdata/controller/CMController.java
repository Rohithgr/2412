package com.cmdata.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.cmdata.dao.CMDAO;
import com.cmdata.dao.CMDAOImpl;
import com.cmdata.model.CM;

public class CMController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	RequestDispatcher dispatcher = null;
	CMDAO cmDAO = null;
	
	public CMController() {
		cmDAO = new CMDAOImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if(action == null) {
			action = "LIST";
		}
		
		switch(action) {
			
			case "LIST":
				listCM(request, response);
				break;
				
		
				
			case "DELETE":
				deleteCM(request, response);
				break;
				
			default:
				listCM(request, response);
				break;
				
		}
		
	}

	private void deleteCM(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String state = request.getParameter("state");
	
		if(cmDAO.delete(state)) {
			request.setAttribute("NOTIFICATION", "CM Deleted Successfully!");
		}
		
		listCM(request, response);
	}


	private void listCM(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<CM> theList = cmDAO.get();
		
		request.setAttribute("list", theList);
		
		dispatcher = request.getRequestDispatcher("employee-list.jsp");
		
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		CM e = new CM();
		e.setId(request.getParameter("id"));
		e.setName(request.getParameter("name"));
		e.setQualification(request.getParameter("qualification"));
		e.setState(request.getParameter("state"));
		e.setDate(request.getParameter("date"));
		e.setParty(request.getParameter("party"));
		
		if(id.isEmpty() || id == null) {
			
			if(cmDAO.save(e)) {
				request.setAttribute("NOTIFICATION", "Employee Saved Successfully!");
			}
		
		}
		
		listCM(request, response);
	}

}