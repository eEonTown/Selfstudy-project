package com.yh.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yh.user.model.service.UserService;
import com.yh.user.model.vo.User;

/**
 * Servlet implementation class UserJoin
 */
@WebServlet("/join.me")
public class UserJoin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserJoin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String userName = request.getParameter("userName");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		User user = new User(userId, userPwd, userName, gender, email, phone);
		
		int result = new UserService().userJoin(user);
		
		if(result > 0) {
			RequestDispatcher view = request.getRequestDispatcher("index.jsp");
			request.setAttribute("succes", "회원가입에 성공 했습니다.");
			view.forward(request, response);
		}else {
			RequestDispatcher view = request.getRequestDispatcher("index.jsp");
			request.setAttribute("fail", "회원가입에 실패 했습니다.");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
