package cn.zhengsigen.java.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

@WebServlet("/ATM/takemoney")
public class TakeMoney extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String money = req.getParameter("money");
		String passwd = req.getParameter("passwd");
		User user = (User) req.getSession().getAttribute("USER");
		SqlSession session1 = Tool.getMapper();
		UserMapper mapper = session1.getMapper(UserMapper.class);
		mapper.takeMoney(money, user.getId(),passwd);
		resp.sendRedirect("/ATM/list");
	}
	
	
}
