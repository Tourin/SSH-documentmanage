/**
 * 
 */
package com.my.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter extends HttpServlet implements Filter {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void destroy() {
	}

	public void doFilter(ServletRequest sRequest, ServletResponse sResponse,
			FilterChain filterChain) throws IOException, ServletException {
		sResponse.setContentType("text/html; charset=UTF-8");
		HttpServletRequest request = (HttpServletRequest) sRequest;
		HttpServletResponse response = (HttpServletResponse) sResponse;
		HttpSession session = request.getSession();
		String url = request.getServletPath();
		String contextPath = request.getContextPath();
		if (url.equals(""))
			url += "/";
		// 若访问后台资源
		if ((url.startsWith("/") && !url.startsWith("/login") && !url
				.contains("adduser.jsp"))) {
			// 过滤到login
			String rights = (String) session.getAttribute("rights");
			if (rights == null) {
				response.sendRedirect(contextPath + "/login.jsp");
				return;
			}
		}
		filterChain.doFilter(sRequest, sResponse);
	}

	public void init(FilterConfig arg0) throws ServletException {

	}
}