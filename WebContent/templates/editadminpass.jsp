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
<script language="javascript">
	function Check() {
		if (document.getElementById('password').value != document
				.getElementById('passwordComfirm').value) {
			alert("两次密码输入不一致");
			document.getElementById('password').focus();
			document.getElementById('password').value = "";
			document.getElementById('passwordComfirm').value = "";
			return false;
		}
	}
</script>
</head>
<body>
	${message}
	<div class="container">
		<form class="form" action="editAdminPass_acc" method="post">
			<fieldset>
				<legend>个人信息</legend>
				<table class="table table-form table-fluid">
					<tbody>
						<tr class="form-item">
							<th class="form-key"><label for="oldpassword">原密码：</label></th>
							<td class="form-value"><input id="oldpassword"
								name="admin.pass" class="text-input grid-3" type="password"
								data-parent=".form-item" required data-validation-empty="请填写原密码"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="password">新密码：</label></th>
							<td class="form-value"><input id="password" name="newpassword"
								class="text-input grid-3" type="password" required
								data-parent=".form-item" data-validation-empty="请填写新密码"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="passwordComfirm">重复密码：</label>
							</th>
							<td class="form-value"><input id="passwordComfirm"
								class="text-input grid-3" type="password" /></td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td></td>
							<td><input class="button" type="submit" value="保存"
								onclick="javascript:return Check();" /></td>
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
