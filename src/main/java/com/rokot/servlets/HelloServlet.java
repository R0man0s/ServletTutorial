package com.rokot.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.rokot.Constants.*;

/**
 * Servlet implementation class HelloServlet
 */

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
			
			String menuOption = request.getParameter("menuOptions");
			String productName = request.getParameter("productName");
			String forward = request.getParameter("forward");
			
			if ("on".equals(forward)) {
				System.out.println("Forward to ShowMeServlet");

				request.setAttribute(ATTRIBUTE_ABSTRACT_PARAM, "Hi, this is Servlets forvarding !");

				RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/showMe");
				dispatcher.forward(request, response);

				return;
			}			
			
	       ServletOutputStream out = response.getOutputStream();
	       
	       out.println("<html>");
	       out.println("<head><title>Hello Servlet</title></head>");
	       
	       out.println("<body>");
	       out.println("<h3>Hello World</h3>");
	       out.println("This is my first Servlet");
	       out.println("<br>");
	       out.println("menuOption: "+ menuOption);
	       out.println("<br>");
	       out.println("productName: "+ productName);
	       out.println("<br>");
	       out.println("forward: "+ forward);
	       out.println("</body>");
	       out.println("<html>");		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String menuOption = (String) request.getParameter("menu");
		String productName = (String) request.getParameter("productName");
		String forward = (String) request.getParameter("forward");
		
		request.setAttribute("menuOption", menuOption);
		request.setAttribute("productName", productName);
		request.setAttribute("forward", forward);
		
		
		doGet(request, response);
	}

}
