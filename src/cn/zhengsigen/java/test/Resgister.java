package cn.zhengsigen.java.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

@WebServlet("/ATM/resgister")
public class Resgister extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/atm/resgister.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String telNumber = req.getParameter("telNumber");
		String idNumber = req.getParameter("idNumber");
		String name = req.getParameter("name");
		String passwd = req.getParameter("passwd");
		String payPasswd = req.getParameter("payPasswd");

		int newNum = (int) ((Math.random() * 9 + 1) * 100000000);
		String bankCard = "5412399323" + newNum;

		SqlSession session = Tool.getMapper();
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User();
		user.setTelNumber(telNumber);
		user.setIdNumber(idNumber);
		user.setName(name);
		user.setPasswd(passwd);
		user.setPayPasswd(payPasswd);
		user.setBankCard(bankCard);
		System.out.println(user);
		mapper.addUser(user);
		System.out.println("新增成功");
		resp.sendRedirect("/ATM/login");
	}
}
