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
		<form class="form" action="editThesis_doc" method="post"
			enctype="multipart/form-data">
			<fieldset>
				<legend>修改论文</legend>
				<table class="table table-form table-fluid">
					<tbody>
						<tr class="form-item">
							<th class="form-key"><label for="text">标题：</label></th>
							<td class="form-value"><input id="text" name="thesis.title"
								class="text-input grid-3" type="text" data-parent=".form-item"
								required data-validation-empty="请输入标题"
								data-validation-placement="right" value="${thesis.title}" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="text">专业：</label></th>
							<td class="form-value"><input id="text" name="thesis.specialty"
								class="text-input grid-3" type="text" data-parent=".form-item"
								required data-validation-empty="请输入标题"
								data-validation-placement="right" value="${thesis.specialty}" /></td>
						</tr>
						<tr class="form-item">
							<th class="form-key"><label for="text">学位：</label></th>
							<td class="form-value"><select id="select"
								name="thesis.educational" class="grid-3"
								data-validation-placement="right">
									<option value="学士"
										<c:if test="${auth.educational eq '学士'}">selected="selected"</c:if>>学士</option>
									<option value="硕士"
										<c:if test="${auth.educational eq '硕士'}">selected="selected"</c:if>>硕士</option>
									<option value="博士"
										<c:if test="${auth.educational eq '博士'}">selected="selected"</c:if>>博士</option>
							</select></td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td></td>
							<td><input class="button" type="submit" value="修改" />&nbsp;&nbsp;<input
								class="button" onclick="window.location.href='listthesis.jsp'"
								value="取消" type="reset" /></td>
						</tr>
					</tfoot>
				</table>
			</fieldset>
			<input type="hidden" name="thesis.infoAuthor.authorId"
				value="${thesis.infoAuthor.authorId}" /> <input type="hidden"
				name="thesis.thesisId" value="${thesis.thesisId}" /> <input
				type="hidden" name="thesis.path" value="${thesis.path}" />
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
