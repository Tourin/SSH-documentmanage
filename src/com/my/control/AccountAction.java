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
				stf.append("<a class='menu_item js-loading-trigger' href='templates/typography.html' target='mainframe' hidefocus>添加作者</a>");
				stf.append("<a class='menu_item js-loading-trigger' href='templates/typography.html' target='mainframe' hidefocus>添加发刊单位</a>");
				stf.append("<a class='menu_item js-loading-trigger' href='templates/typography.html' target='mainframe' hidefocus>查看作者和论文</a>");
				stf.append("<a class='menu_item js-loading-trigger' href='templates/typography.html' target='mainframe' hidefocus>查看发刊单位和期刊</a>");
				stf.append("<a class='menu_item js-loading-trigger' href='templates/typography.html' target='mainframe' hidefocus>添加论文</a>");
				stf.append("<a class='menu_item js-loading-trigger' href='templates/typography.html' target='mainframe' hidefocus>添加期刊</a>");
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
				stf.append("<a class='menu_item js-loading-trigger' href='templates/typography.html' target='mainframe' hidefocus>论文查询</a>");
				stf.append("<a class='menu_item js-loading-trigger' href='templates/typography.html' target='mainframe' hidefocus>期刊查询</a>");
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
		request.put("message",
				"<script laguage='JavaScript'> alert('保存成功!') </script>");
		return "edituser";
	}

	public String editAdmin() throws Exception {
		accountbo.editInfoAdmin(admin);
		request.put("message",
				"<script laguage='JavaScript'> alert('保存成功!') </script>");
		return "editadmin";
	}
}
