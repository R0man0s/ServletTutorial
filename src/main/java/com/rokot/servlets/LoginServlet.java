package com.rokot.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rokot.UserInfo;
import com.rokot.Constants;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletOutputStream out = response.getOutputStream();

		// ???????? ?????? HttpSession
		HttpSession session = request.getSession();

		// ???????? ???????????? ??????? ????? ? ?????? (login).
		UserInfo loginedInfo = new UserInfo("Tom", "USA", 5);

		// ????????? ?????????? ???????????? ? 1 ??????? (attribute) Session.
		session.setAttribute(Constants.SESSION_USER_KEY, loginedInfo);

		out.println("<html>");
		out.println("<head><title>Session example</title></head>");

		out.println("<body>");
		out.println("<h3>You are logined!, info stored in session</h3>");

		out.println("<a href='userInfo'>View User Info</a>");
		out.println("</body>");
		out.println("<html>");
	}

}
