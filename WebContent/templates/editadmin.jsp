<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<form class="form" action="editAdmin_acc" method="post">
			<fieldset>
				<legend>个人信息</legend>
				<table class="table table-form table-fluid">
					<tbody>
						<tr class="form-item">
							<th class="form-key"><label for="text">姓名：</label></th>
							<td class="form-value"><input id="text" name="admin.rname"
								class="text-input grid-3" type="text" data-parent=".form-item"
								data-validation-placement="right" value="${admin.rname}" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="text">昵称：</label></th>
							<td class="form-value"><input id="text" name="admin.nname"
								class="text-input grid-3" type="text" data-parent=".form-item"
								data-validation-placement="right" value="${admin.nname}" /></td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td></td>
							<td><input class="button" type="submit" value="保存" /></td>
						</tr>
					</tfoot>
				</table>
			</fieldset>
			<input type="hidden" name="admin.adminId" value="${admin.adminId}"/>
			<input type="hidden" name="admin.name" value="${admin.name}"/>
			<input type="hidden" name="admin.pass" value="${admin.pass}"/>
		</form>
	</div>
	<!-- / .container -->

	<script src="../scripts/lib/require.js"></script>
	<script>
    require(['../scripts/config'], function(config) {
      require(['app/main/form']);
    });
  </script>
</body>
</html>
