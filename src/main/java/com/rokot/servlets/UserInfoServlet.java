package com.rokot.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rokot.Constants;
import com.rokot.UserInfo;

/**
 * Servlet implementation class UserInfoServlet
 */
public class UserInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserInfoServlet() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletOutputStream out = response.getOutputStream();

		// ???????? ?????? HttpSession.
		HttpSession session = request.getSession();

		// ???????? ?????? UserInfo ??????????? ? session
		// ????? ????, ??? ???????????? ??????? ????? ? ??????? (login).
		UserInfo loginedInfo = (UserInfo) session.getAttribute(Constants.SESSION_USER_KEY);

		// ???? ??? ?? ????? ? ??????? (login), Redirect (?????????????) ?? ???????? login (LoginServlet).
		if (loginedInfo == null) {
			// ==> /ServletTutorial/login
			response.sendRedirect(this.getServletContext().getContextPath() + "/login");
			return;
		}

		out.println("<html>");
		out.println("<head><title>Session example</title></head>");

		out.println("<body>");

		out.println("<h3>User Info:</h3>");

		out.println("<p>User Name:" + loginedInfo.getUserName() + "</p>");
		out.println("<p>Country:" + loginedInfo.getCountry() + "</p>");
		out.println("<p>Post:" + loginedInfo.getPost() + "</p>");

		out.println("</body>");
		out.println("<html>");
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}
