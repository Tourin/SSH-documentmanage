<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<title>Backstage</title>
<link rel="stylesheet" href="../styles/backstage.css" />
<script>
	(function() {
		var html = document.getElementsByTagName('html')[0];
		html.className = html.className.replace('no-js', 'js');
	})();
</script>
</head>
<body>
	${message}
	<div class="container">
		<form class="form" action="addUser_acc" method="post">
			<fieldset>
				<legend>用户注册</legend>
				<table class="table table-form table-fluid">
					<tbody>
						<tr class="form-item">
							<th class="form-key"><label for="text">用户名：</label></th>
							<td class="form-value"><input id="text" name="user.name"
								class="text-input grid-3" type="text" data-parent=".form-item"
								required data-validation-empty="请填写用户名"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="text">密码：</label></th>
							<td class="form-value"><input id="text" name="user.pass"
								class="text-input grid-3" type="password"
								data-parent=".form-item" required data-validation-empty="请填写密码"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="text">姓名：</label></th>
							<td class="form-value"><input id="text" name="user.rname"
								class="text-input grid-3" type="text" data-parent=".form-item"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="number">年龄：</label></th>
							<td class="form-value"><input id="number" name="user.age"
								class="text-input grid-3" type="text" data-type="number"
								required data-parent=".form-item"
								data-validation-empty="年龄有误，请重新填写"
								data-validation-error="年龄有误，请重新填写"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="idcard">身份证号：</label></th>
							<td class="form-value"><input id="idcard" name="user.idcard"
								class="text-input grid-3" type="text" data-type="idcard"
								required data-parent=".form-item"
								data-validation-empty="身份证有误，请重新填写"
								data-validation-error="身份证有误，请重新填写"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="text">院校：</label></th>
							<td class="form-value"><input id="text" name="user.school"
								class="text-input grid-3" type="text" data-parent=".form-item"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="text">专业：</label></th>
							<td class="form-value"><input id="text" name="user.pecialty"
								class="text-input grid-3" type="text" data-parent=".form-item"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="text">关注期刊类型：</label></th>
							<td class="form-value"><input id="text" name="user.per"
								class="text-input grid-3" type="text" data-parent=".form-item"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="select">学历：</label></th>
							<td class="form-value"><select id="select"
								name="user.educational" class="grid-3"
								data-validation-placement="right">
									<option value="学士">学士</option>
									<option value="硕士">硕士</option>
									<option value="博士">博士</option>
							</select></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="textarea">自我介绍：</label></th>
							<td class="form-value"><textarea name="user.introduction"
									id="textarea" class="grid-8" rows="10"></textarea> <br></td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td></td>
							<td><input class="button" type="submit" value="注册" />&nbsp;&nbsp;<input
								class="button" onclick="window.location.href='../login.jsp'"
								value="取消" type="reset" /></td>
						</tr>
					</tfoot>
				</table>
			</fieldset>
		</form>
	</div>
	<!-- / .container -->

	<script src="../scripts/lib/require.js"></script>
	<script>
		require([ '../scripts/config' ], function(config) {
			require([ 'app/main/form' ]);
		});
	</script>
</body>
</html>
