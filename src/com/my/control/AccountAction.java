package com.my.control;


public class AccountAction extends BaseAction {/*
												 * 
												 * private String newpassword;
												 * 
												 * public String
												 * getNewpassword() { return
												 * newpassword; }
												 * 
												 * public void
												 * setNewpassword(String
												 * newpassword) {
												 * this.newpassword =
												 * newpassword; }
												 * 
												 * public String login() throws
												 * Exception { if
												 * (user.getUserNo().isEmpty()
												 * ||
												 * user.getPassWord().isEmpty())
												 * { request.put("message",
												 * "<script laguage='JavaScript'> alert('用户名密码不能为空!') </script>"
												 * ); return "login"; }
												 * StringBuffer stf = new
												 * StringBuffer(); if
												 * (user.getRole().getId() == 3)
												 * { User u =
												 * accountbo.checkLoginUser
												 * (user); if (u != null &&
												 * u.getRole().getId() == 3) {
												 * stf.append(
												 * "<H1 class='title'><A href='javascript:void(0)'><font size='2' color=#313196>选课信息</font></a></H1>"
												 * ); stf.append(
												 * "<div class='content'>");
												 * stf.append(
												 * "<p>&nbsp;&nbsp;<a href='userallcourse.jsp' target='main'><font size='2' color=#5454c6>所有选课</font></a></p>"
												 * ); stf.append(
												 * "<p>&nbsp;&nbsp;<a href='usercourse.jsp' target='main'><font size='2' color=#5454c6>分数查询</font></a></p>"
												 * ); stf.append(
												 * "<p>&nbsp;&nbsp;<a href='userinfo.jsp' target='main'><font size='2' color=#5454c6>个人信息</font></a></p>"
												 * ); stf.append("</div>");
												 * session.put("rights",
												 * stf.toString());
												 * session.put("user", u);
												 * return "index"; } else {
												 * request.put("message",
												 * "<script laguage='JavaScript'> alert('密码错误!') </script>"
												 * ); return "login"; } } else {
												 * tech
												 * .setTechNo(user.getUserNo());
												 * tech
												 * .setPassWord(user.getPassWord
												 * ()); Teacher t =
												 * accountbo.checkLoginTech
												 * (tech); if (t != null) { if
												 * (t.getRole().getId() == 1) {
												 * stf.append(
												 * "<H1 class='title'><A href='javascript:void(0)'><font size='2' color=#313196>管理教师信息</font></a></H1>"
												 * ); stf.append(
												 * "<div class='content'>");
												 * stf.append(
												 * "<p>&nbsp;&nbsp;<a href='addtech.jsp' target='main'><font size='2' color=#5454c6>添加教师</font></a></p>"
												 * ); stf.append(
												 * "<p>&nbsp;&nbsp;<a href='listtech.jsp' target='main'><font size='2' color=#5454c6>教师信息列表</font></a></p>"
												 * ); stf.append("</div>");
												 * 
												 * stf.append(
												 * "<H1 class='title'><A href='javascript:void(0)'><font size='2' color=#313196>管理学生信息</font></a></H1>"
												 * ); stf.append(
												 * "<div class='content'>");
												 * stf.append(
												 * "<p>&nbsp;&nbsp;<a href='adduser.jsp' target='main'><font size='2' color=#5454c6>添加学生</font></a></p>"
												 * ); stf.append(
												 * "<p>&nbsp;&nbsp;<a href='listuser.jsp' target='main'><font size='2' color=#5454c6>学生信息列表</font></a></p>"
												 * ); stf.append("</div>");
												 * 
												 * stf.append(
												 * "<H1 class='title'><A href='javascript:void(0)'><font size='2' color=#313196>管理课程信息</font></a></H1>"
												 * ); stf.append(
												 * "<div class='content'>");
												 * stf.append(
												 * "<p>&nbsp;&nbsp;<a href='addcourse.jsp' target='main'><font size='2' color=#5454c6>添加课程</font></a></p>"
												 * ); stf.append(
												 * "<p>&nbsp;&nbsp;<a href='listcourse.jsp' target='main'><font size='2' color=#5454c6>课程信息列表</font></a></p>"
												 * ); stf.append("</div>");
												 * session.put("rights",
												 * stf.toString());
												 * session.put("user", t);
												 * return "index"; } else if
												 * (t.getRole().getId() == 2) {
												 * stf.append(
												 * "<H1 class='title'><A href='javascript:void(0)'><font size='2' color=#313196>管理学生成绩</font></a></H1>"
												 * ); stf.append(
												 * "<div class='content'>");
												 * stf.append(
												 * "<p>&nbsp;&nbsp;<a href='techcourse.jsp' target='main'><font size='2' color=#5454c6>选择科目</font></a></p>"
												 * ); stf.append(
												 * "<p>&nbsp;&nbsp;<a href='techinfo.jsp' target='main'><font size='2' color=#5454c6>个人信息</font></a></p>"
												 * ); stf.append("</div>");
												 * session.put("rights",
												 * stf.toString());
												 * session.put("user", t);
												 * return "index"; } else {
												 * request.put("message",
												 * "<script laguage='JavaScript'> alert('密码不正确!') </script>"
												 * ); return "login"; } } else {
												 * request.put("message",
												 * "<script laguage='JavaScript'> alert('密码不正确!') </script>"
												 * ); return "login"; } } }
												 * 
												 * public String logout() throws
												 * Exception { request.clear();
												 * session.clear(); return
												 * "login"; }
												 */
	/**************************************** user ************************************************************************/
	/*
	 * 
	 * public String addUserPrepare() throws Exception {
	 * request.put("speciallist", accountbo.getAllSpecial()); return "adduser";
	 * }
	 * 
	 * public String addUser() throws Exception { if
	 * (accountbo.isExistUser(user.getUserNo())) { request.put("message",
	 * "<script laguage='JavaScript'> alert('该学号已经存在!') </script>"); return
	 * this.addUserPrepare(); } accountbo.addUser(user); request.put("message",
	 * "<script laguage='JavaScript'> alert('保存成功!') </script>"); return
	 * this.addUserPrepare(); }
	 * 
	 * public String listUserPrepare() throws Exception { if (pageNo == null ||
	 * pageNo == 0) { pageNo = 1; } int totalRecords = 0; List<User> list; list
	 * = accountbo.getAllUserByPage(pageNo, 15); totalRecords =
	 * accountbo.getTotalUserRecords().intValue(); PageBean<User> pagebean =
	 * this.setPageBean(list, totalRecords);
	 * pagebean.setPageAction("listUserPrepare_acc"); return "listuser"; }
	 * 
	 * public String searchUser() throws Exception { if (pageNo == null ||
	 * pageNo == 0) { pageNo = 1; } int totalRecords = 0; List<User> list; list
	 * = accountbo.searchUserByPage(pageNo, 15, user.getUserNo(),
	 * user.getUserName()); totalRecords =
	 * accountbo.searchTotalUserRecords(user.getUserNo(),
	 * user.getUserName()).intValue(); PageBean<User> pagebean =
	 * this.setPageBean(list, totalRecords);
	 * pagebean.setPageAction("searchUser_acc"); return "listuser"; }
	 * 
	 * public String removeUser() throws Exception {
	 * accountbo.removeUser(user.getId()); return this.listUserPrepare(); }
	 * 
	 * public String editUserPrepare() throws Exception { user =
	 * accountbo.getUserById(User.class, user.getId()); request.put("user",
	 * user); request.put("speciallist", accountbo.getAllSpecial()); return
	 * "edituser"; }
	 * 
	 * public String editUser() throws Exception { for (UserCourse userCourse :
	 * user.getUserCourses()) { if (!userCourse.getCourse().getSpecials()
	 * .contains(user.getSpecial())) { user.getUserCourses().remove(userCourse);
	 * } } accountbo.editUser(user); request.put("message",
	 * "<script laguage='JavaScript'> alert('修改成功!') </script>"); return
	 * this.editUserPrepare(); }
	 *//**************************************** tech ************************************************************************/
	/*
	 * 
	 * public String addTech() throws Exception { if
	 * (accountbo.isExistTech(tech.getTechNo())) { request.put("message",
	 * "<script laguage='JavaScript'> alert('该工号已经存在!') </script>"); return
	 * "addtech"; } accountbo.addTech(tech); request.put("message",
	 * "<script laguage='JavaScript'> alert('保存成功!') </script>"); return
	 * "addtech"; }
	 * 
	 * public String listTechPrepare() throws Exception { if (pageNo == null ||
	 * pageNo == 0) { pageNo = 1; } int totalRecords = 0; List<Teacher> list;
	 * list = accountbo.getAllTechByPage(pageNo, 15); totalRecords =
	 * accountbo.getTotalTechRecords().intValue(); PageBean<Teacher> pagebean =
	 * this.setPageBean(list, totalRecords);
	 * pagebean.setPageAction("listTechPrepare_acc"); return "listtech"; }
	 * 
	 * public String searchTech() throws Exception { if (pageNo == null ||
	 * pageNo == 0) { pageNo = 1; } int totalRecords = 0; List<Teacher> list;
	 * list = accountbo.searchTechByPage(pageNo, 15, tech.getTechNo(),
	 * tech.getTechName()); totalRecords =
	 * accountbo.searchTotalTechRecords(tech.getTechNo(),
	 * tech.getTechName()).intValue(); PageBean<Teacher> pagebean =
	 * this.setPageBean(list, totalRecords);
	 * pagebean.setPageAction("searchTech_acc"); return "listtech"; }
	 * 
	 * public String removeTech() throws Exception {
	 * accountbo.removeTech(tech.getId()); return this.listTechPrepare(); }
	 * 
	 * public String editTechPrepare() throws Exception { tech =
	 * accountbo.getTechById(Teacher.class, tech.getId()); request.put("tech",
	 * tech); return "edittech"; }
	 * 
	 * public String editTech() throws Exception { Teacher techer =
	 * accountbo.getTechById(Teacher.class, tech.getId());
	 * techer.setTechName(tech.getTechName()); techer.setSex(tech.getSex());
	 * techer.setTitle(tech.getTitle()); accountbo.editTech(techer);
	 * request.put("message",
	 * "<script laguage='JavaScript'> alert('修改成功!') </script>"); return
	 * this.editTechPrepare(); }
	 * 
	 * public String editUserPass() throws Exception { if
	 * (user.getRole().getId() == 3) { User u = accountbo.checkLoginUser(user);
	 * if (u == null) { request.put("message",
	 * "<script laguage='JavaScript'> alert('原始密码不对，请重新输入!') </script>"); return
	 * "edituserpass"; } u.setPassWord(newpassword); accountbo.editUser(u); }
	 * else { tech.setTechNo(user.getUserNo());
	 * tech.setPassWord(user.getPassWord()); Teacher t =
	 * accountbo.checkLoginTech(tech); if (t == null) { request.put("message",
	 * "<script laguage='JavaScript'> alert('原始密码不对，请重新输入!') </script>"); return
	 * "edituserpass"; } t.setPassWord(newpassword); accountbo.editTech(t); }
	 * session.clear(); request.put("message",
	 * "<script laguage='JavaScript'> alert('修改成功,请重新登录!') </script>"); return
	 * "edituserpass"; }
	 * 
	 * @SuppressWarnings("unchecked") public <T> PageBean<T> setPageBean(List<T>
	 * list, int totalRecords) { PageBean<T> pagebean = (PageBean<T>)
	 * request.get("pagebean"); if (pagebean == null) { pagebean = new
	 * PageBean<T>(); request.put("pagebean", pagebean); }
	 * pagebean.setPageNo(pageNo); // 设置当前页码 pagebean.setPageSize(15);// 每页显示15个
	 * pagebean.setTotalRecords(totalRecords); pagebean.setList(list); return
	 * pagebean; }
	 */
}
