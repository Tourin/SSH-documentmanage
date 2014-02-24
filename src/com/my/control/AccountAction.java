package com.my.control;

public class AccountAction extends BaseAction {

	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String login() throws Exception {
		if (user.getName().isEmpty() || user.getPass().isEmpty()) {
			request.put("message",
					"<script laguage='JavaScript'> alert('用户名密码不能为空!') </script>");
			return "login";
		}
		StringBuilder stf = new StringBuilder();
		if (role.equals("1")) {
			admin.setName(user.getName());
			admin.setPass(user.getPass());
			admin = accountbo.checkLoginInfoAdmin(admin);
			if (admin == null) {
				request.put("message",
						"<script laguage='JavaScript'> alert('用户名密码不正确!') </script>");
				return "login";
			} else {
				stf.append("<H1 class='title'><A href='javascript:void(0)'><font size='2' color=#313196>管理用户信息</font></a></H1>");
				stf.append("<div class='content'>");
				stf.append("<p>&nbsp;&nbsp;<a href='addadmin.jsp' target='main'><font size='2' color=#5454c6>添加用户</font></a></p>");
				stf.append("<p>&nbsp;&nbsp;<a href='listadmin.jsp' target='main'><font size='2' color=#5454c6>用户信息列表</font></a></p>");
				stf.append("</div>");

				stf.append("<H1 class='title'><A href='javascript:void(0)'><font size='2' color=#313196>管理维修点信息</font></a></H1>");
				stf.append("<div class='content'>");
				stf.append("<p>&nbsp;&nbsp;<a href='addaddress.jsp' target='main'><font size='2' color=#5454c6>添加维修点</font></a></p>");
				stf.append("<p>&nbsp;&nbsp;<a href='listaddress.jsp' target='main'><font size='2' color=#5454c6>维修点信息列表</font></a></p>");
				stf.append("</div>");

				stf.append("<H1 class='title'><A href='javascript:void(0)'><font size='2' color=#313196>管理配件信息</font></a></H1>");
				stf.append("<div class='content'>");
				stf.append("<p>&nbsp;&nbsp;<a href='addpart.jsp' target='main'><font size='2' color=#5454c6>添加配件</font></a></p>");
				stf.append("<p>&nbsp;&nbsp;<a href='listpart.jsp' target='main'><font size='2' color=#5454c6>配件信息列表</font></a></p>");
				stf.append("</div>");
				session.put("rights", stf.toString());
				session.put("admin", admin);
				return "index";
			}
		} else {
			user = accountbo.checkLoginInfoUser(user);
			if (user == null) {
				request.put("message",
						"<script laguage='JavaScript'> alert('用户名密码不正确!') </script>");
				return "login";
			} else {
				stf.append("<H1 class='title'><A href='javascript:void(0)'><font size='2' color=#313196>管理用户信息</font></a></H1>");
				stf.append("<div class='content'>");
				stf.append("<p>&nbsp;&nbsp;<a href='addadmin.jsp' target='main'><font size='2' color=#5454c6>添加用户</font></a></p>");
				stf.append("<p>&nbsp;&nbsp;<a href='listadmin.jsp' target='main'><font size='2' color=#5454c6>用户信息列表</font></a></p>");
				stf.append("</div>");

				stf.append("<H1 class='title'><A href='javascript:void(0)'><font size='2' color=#313196>管理维修点信息</font></a></H1>");
				stf.append("<div class='content'>");
				stf.append("<p>&nbsp;&nbsp;<a href='addaddress.jsp' target='main'><font size='2' color=#5454c6>添加维修点</font></a></p>");
				stf.append("<p>&nbsp;&nbsp;<a href='listaddress.jsp' target='main'><font size='2' color=#5454c6>维修点信息列表</font></a></p>");
				stf.append("</div>");

				stf.append("<H1 class='title'><A href='javascript:void(0)'><font size='2' color=#313196>管理配件信息</font></a></H1>");
				stf.append("<div class='content'>");
				stf.append("<p>&nbsp;&nbsp;<a href='addpart.jsp' target='main'><font size='2' color=#5454c6>添加配件</font></a></p>");
				stf.append("<p>&nbsp;&nbsp;<a href='listpart.jsp' target='main'><font size='2' color=#5454c6>配件信息列表</font></a></p>");
				stf.append("</div>");
				session.put("rights", stf.toString());
				session.put("admin", admin);
				return "index";
			}
		}
	}
}
