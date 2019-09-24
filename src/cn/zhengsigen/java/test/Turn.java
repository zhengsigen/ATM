package cn.zhengsigen.java.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

@WebServlet("/ATM/turnmoney")
public class Turn extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String money = req.getParameter("money");
		String bank_card = req.getParameter("bank_card");
		String name = req.getParameter("name");
		User user = (User) req.getSession().getAttribute("USER");
		SqlSession session1 = Tool.getMapper();
		UserMapper mapper = session1.getMapper(UserMapper.class);
		mapper.turnMoney(money,user.getId());
		mapper.turnReception(money, bank_card, name);
		resp.sendRedirect("/ATM/list");
	}

}
