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
		<form class="form" action="addThesis_doc" method="post"
			enctype="multipart/form-data">
			<fieldset>
				<legend>添加论文</legend>
				<table class="table table-form table-fluid">
					<tbody>
						<tr class="form-item">
							<th class="form-key"><label for="text">标题：</label></th>
							<td class="form-value"><input id="text" name="thesis.title"
								class="text-input grid-3" type="text" data-parent=".form-item"
								required data-validation-empty="请输入标题"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="text">专业：</label></th>
							<td class="form-value"><input id="text" name="thesis.specialty"
								class="text-input grid-3" type="text" data-parent=".form-item"
								required data-validation-empty="请输入专业"
								data-validation-placement="right" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="text">学位：</label></th>
							<td class="form-value"><select id="select"
								name="thesis.educational" class="grid-3"
								data-validation-placement="right">
									<option value="学士">学士</option>
									<option value="硕士">硕士</option>
									<option value="博士">博士</option>
							</select></td>
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
								class="button" onclick="window.location.href='listauthor.jsp'"
								value="取消" type="reset" /></td>
						</tr>
					</tfoot>
				</table>
			</fieldset>
			<input type="hidden" name="thesis.infoAuthor.authorId"
				value="${param.authorId}" />
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
