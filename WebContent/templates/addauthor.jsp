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
		<form class="form" action="addAuth_adm" method="post">
			<fieldset>
				<legend>添加作者</legend>
				<table class="table table-form table-fluid">
					<tbody>
						<tr class="form-item">
							<th class="form-key"><label for="text">姓名：</label></th>
							<td class="form-value"><input id="text" name="auth.name"
								class="text-input grid-3" type="text" data-parent=".form-item"
								required data-validation-empty="请输入姓名"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="number">年龄：</label></th>
							<td class="form-value"><input id="number" name="auth.age"
								class="text-input grid-3" type="text" data-type="number"
								required data-parent=".form-item"
								data-validation-empty="年龄有误，请重新填写"
								data-validation-error="年龄有误，请重新填写"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="idcard">身份证号：</label></th>
							<td class="form-value"><input id="idcard" name="auth.idcard"
								class="text-input grid-3" type="text" data-type="idcard"
								required data-parent=".form-item"
								data-validation-empty="身份证有误，请重新填写"
								data-validation-error="身份证有误，请重新填写"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="text">院校：</label></th>
							<td class="form-value"><input id="text" name="auth.school"
								class="text-input grid-3" type="text" data-parent=".form-item"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="text">专业：</label></th>
							<td class="form-value"><input id="text"
								name="auth.specialty" class="text-input grid-3" type="text"
								data-parent=".form-item" data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="select">学历：</label></th>
							<td class="form-value"><select id="select"
								name="auth.educational" class="grid-3"
								data-validation-placement="right">
									<option value="大专">大专</option>
									<option value="本科">本科</option>
									<option value="硕士">硕士</option>
									<option value="博士">博士</option>
							</select></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="textarea">履历介绍：</label></th>
							<td class="form-value"><textarea name="auth.introduction"
									id="textarea" class="grid-8" rows="10"></textarea> <br></td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td></td>
							<td><input class="button" type="submit" value="添加" />&nbsp;&nbsp;<input
								class="button" type="reset" value="重置" /></td>
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
