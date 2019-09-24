package cn.zhengsigen.java.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

@WebServlet("/ATM/list")
public class List extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {

		arg0.getRequestDispatcher("/atm/list.jsp").forward(arg0, arg1);
	}
	
	
}
