package com.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.EvaluationFile;
import com.model.Evaluation;


@WebServlet("/Rating")
public class Rating extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<Evaluation> list;
	int i; // current index of Restaurant in the list
       
  
    public Rating() {
        super();
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String type=request.getParameter("type");
		list=EvaluationFile.readFile();
		i=Integer.valueOf(type)-1;
		String r=list.get(i).getName();
		request.setAttribute("r", r);
		double m=list.get(i).getMedium();
		request.setAttribute("m", m);
		
    	this.getServletContext().getRequestDispatcher("/WEB-INF/rate.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String qn=request.getParameter("qn");
		String qsa=request.getParameter("qsa");
		String qse=request.getParameter("qse");
		list=EvaluationFile.readFile();
		request.setAttribute("r", list.get(i).getName());	
		list.set(i, new Evaluation(list.get(i).getName(),Integer.valueOf(qn),Integer.valueOf(qsa),Integer.valueOf(qse)));
		request.setAttribute("m", list.get(i).getMedium());				
		EvaluationFile.writeFile();
				
		this.getServletContext().getRequestDispatcher("/WEB-INF/rate.jsp").forward(request, response);
	}

}