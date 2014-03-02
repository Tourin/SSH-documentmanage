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
		<form class="form" action="addPeriodical_doc" method="post"
			enctype="multipart/form-data">
			<fieldset>
				<legend>添加期刊</legend>
				<table class="table table-form table-fluid">
					<tbody>
						<tr class="form-item">
							<th class="form-key"><label for="text">名称：</label></th>
							<td class="form-value"><input id="text" name="per.name"
								class="text-input grid-3" type="text" data-parent=".form-item"
								required data-validation-empty="请输入名称"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="number">期数：</label></th>
							<td class="form-value"><input id="number" name="per.number"
								class="text-input grid-3" type="text" data-type="number"
								required data-parent=".form-item"
								data-validation-empty="期数有误，请重新填写"
								data-validation-error="期数有误，请重新填写"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="text">类型：</label></th>
							<td class="form-value"><input id="text" name="per.type"
								class="text-input grid-3" type="text" data-parent=".form-item"
								required data-validation-empty="请输入类型"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="upload">上传附件：</label></th>
							<td class="form-value"><input id="upload" type="file"
								name="uploadFile" class="text-input grid-3"
								data-parent=".form-item" required data-validation-empty="请选择附件"
								data-validation-placement="right" /></td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td></td>
							<td><input class="button" type="submit" value="添加" />&nbsp;&nbsp;<input
								class="button" onclick="window.location.href='listunit.jsp'"
								value="取消" type="reset" /></td>
						</tr>
					</tfoot>
				</table>
			</fieldset>
			<input type="hidden" name="per.infoUnit.unitId"
				value="${param.unitId}" />
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
