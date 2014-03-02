package com.my.control;

import com.my.bean.InfoAdmin;
import com.my.bean.InfoUser;

public class AccountAction extends BaseAction {

	private String role;
	private String newpassword;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	public String login() throws Exception {
		if (user.getName().isEmpty() || user.getPass().isEmpty()) {
			request.put("message",
					"<script laguage='JavaScript'> alert('用户名密码不能为空!') </script>");
			return "login";
		}
		StringBuilder stf = new StringBuilder();
		StringBuilder stf2 = new StringBuilder();
		if (role.equals("1")) {
			admin.setName(user.getName());
			admin.setPass(user.getPass());
			admin = accountbo.checkLoginInfoAdmin(admin);
			if (admin == null) {
				request.put("message",
						"<script laguage='JavaScript'> alert('用户名密码不正确!') </script>");
				return "login";
			} else {
				stf.append("<a class='menu_item is-menu_item-on js-loading-trigger' href='templates/readme.html' target='mainframe' hidefocus>首页</a>");
				stf.append("<a class='menu_item js-loading-trigger' href='templates/addauthor.jsp' target='mainframe' hidefocus>添加作者</a>");
				stf.append("<a class='menu_item js-loading-trigger' href='templates/addunit.jsp' target='mainframe' hidefocus>添加发刊单位</a>");
				stf.append("<a class='menu_item js-loading-trigger' href='templates/listauthor.jsp' target='mainframe' hidefocus>查看作者论文</a>");
				stf.append("<a class='menu_item js-loading-trigger' href='templates/listunit.jsp' target='mainframe' hidefocus>查看发刊单位期刊</a>");
				stf2.append("<a class='menu_item js-loading-trigger' href='templates/editadmin.jsp' target='mainframe' hidefocus>基础信息</a>");
				stf2.append("<a class='menu_item js-loading-trigger' href='templates/editadminpass.jsp' target='mainframe' hidefocus>修改密码</a>");
				session.put("rights", stf.toString());
				session.put("rights2", stf2.toString());
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
				stf.append("<a class='menu_item is-menu_item-on js-loading-trigger' href='templates/readme.html' target='mainframe' hidefocus>首页</a>");
				stf.append("<a class='menu_item js-loading-trigger' href='templates/slistthesis.jsp' target='mainframe' hidefocus>论文查询</a>");
				stf.append("<a class='menu_item js-loading-trigger' href='templates/slistperiodical.jsp' target='mainframe' hidefocus>期刊查询</a>");
				stf2.append("<a class='menu_item js-loading-trigger' href='templates/edituser.jsp' target='mainframe' hidefocus>基础信息</a>");
				stf2.append("<a class='menu_item js-loading-trigger' href='templates/edituserpass.jsp' target='mainframe' hidefocus>修改密码</a>");
				session.put("rights", stf.toString());
				session.put("rights2", stf2.toString());
				session.put("user", user);
				return "index";
			}
		}
	}

	public String logout() throws Exception {
		request.clear();
		session.clear();
		return "login";
	}

	public String editUser() throws Exception {
		accountbo.editInfoUser(user);
		session.put("user", user);
		request.put("message",
				"<script laguage='JavaScript'> alert('保存成功!') </script>");
		return "edituser";
	}

	public String editUserPass() throws Exception {
		InfoUser u = (InfoUser) session.get("user");
		user.setName(u.getName());
		user = accountbo.checkLoginInfoUser(user);
		if (user == null) {
			request.put("message",
					"<script laguage='JavaScript'> alert('原始密码不对，请重新输入!') </script>");
			return "edituserpass";
		}
		u.setPass(newpassword);
		accountbo.editInfoUser(u);
		session.clear();
		request.put("message",
				"<script laguage='JavaScript'> alert('修改成功,请重新登录!') </script>");
		return "edituserpass";
	}

	public String editAdmin() throws Exception {
		accountbo.editInfoAdmin(admin);
		session.put("admin", admin);
		request.put("message",
				"<script laguage='JavaScript'> alert('保存成功!') </script>");
		return "editadmin";
	}

	public String editAdminPass() throws Exception {
		InfoAdmin a = (InfoAdmin) session.get("admin");
		admin.setName(a.getName());
		admin = accountbo.checkLoginInfoAdmin(admin);
		if (admin == null) {
			request.put("message",
					"<script laguage='JavaScript'> alert('原始密码不对，请重新输入!') </script>");
			return "editadminpass";
		}
		a.setPass(newpassword);
		accountbo.editInfoAdmin(a);
		session.clear();
		request.put("message",
				"<script laguage='JavaScript'> alert('修改成功,请重新登录!') </script>");
		return "editadminpass";
	}

	public String addUser() throws Exception {
		if (accountbo.isExistInfoUser(user.getName())) {
			request.put("message", "用户名已经存在!");
			return "adduser";
		}
		accountbo.addInfoUser(user);
		request.put("message",
				"<script laguage='JavaScript'> alert('注册成功，请登录!') </script>");
		return "login";
	}
}
