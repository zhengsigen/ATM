package cn.zhengsigen.java.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

@WebServlet("/ATM/login")
public class Login extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/atm/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String passwd = req.getParameter("passwd");
		SqlSession session1 = Tool.getMapper();
		UserMapper mapper = session1.getMapper(UserMapper.class);
		User user = mapper.login(name, passwd);
		System.out.println("登录成功"+user);
		req.getSession().setAttribute("USER", user);
		req.getRequestDispatcher("/ATM/list").forward(req, resp);
	}
}
