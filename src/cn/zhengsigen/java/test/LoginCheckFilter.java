/*package cn.zhengsigen.java.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

*//**
 * @author Topin@JSC
 *
 *//*
@WebFilter("/ATM/*")
public class LoginCheckFilter implements Filter{
	@Override
	public void destroy() {
	}
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		User user = (User) request.getSession().getAttribute("USER");
		if(user != null) {
			chain.doFilter(req, resp);
			return ;
		}
		response.sendRedirect("/ATM/login");
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}


}
*/