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
		<form class="form" action="editUnit_adm" method="post">
			<fieldset>
				<legend>添加发刊单位</legend>
				<table class="table table-form table-fluid">
					<tbody>
						<tr class="form-item">
							<th class="form-key"><label for="text">单位名称：</label></th>
							<td class="form-value"><input id="text" name="unit.name"
								class="text-input grid-3" type="text" data-parent=".form-item"
								required data-validation-empty="请输入单位名称"
								data-validation-placement="right" value="${unit.name}" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="number">单位规模：</label></th>
							<td class="form-value"><input id="number" name="unit.scale"
								class="text-input grid-3" type="text" data-type="number"
								required data-parent=".form-item"
								data-validation-empty="单位规模有误，请重新填写"
								data-validation-error="单位规模有误，请重新填写"
								data-validation-placement="right" value="${unit.scale}" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="text">涉及领域：</label></th>
							<td class="form-value"><input id="text" name="unit.industry"
								class="text-input grid-3" type="text" data-parent=".form-item"
								data-validation-placement="right" value="${unit.industry}" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="textarea">详细介绍：</label></th>
							<td class="form-value"><textarea name="unit.introduction"
									id="textarea" class="grid-8" rows="10">${unit.introduction}</textarea>
								<br></td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td></td>
							<td><input class="button" type="submit" value="保存" />&nbsp;&nbsp;<input
								class="button" onclick="window.location.href='listauthor.jsp'"
								value="取消" type="reset" /></td>
						</tr>
					</tfoot>
				</table>
			</fieldset>
			<input type="hidden" name="unit.unitId" value="${unit.unitId}" />
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
