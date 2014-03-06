<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
	<div class="container">
		<c:forEach var="comment" items="${request.pagebean.list}">
			<div class="panel panel-info grid-6">
				<h5 class="panel_head">
					<fmt:formatDate value="${comment.date}"
						pattern="yyyy-MM-dd HH:mm:ss" />
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${comment.infoUser.name}${comment.infoAdmin.name}
				</h5>
				<div class="panel_body">
					<code>${comment.info}</code>
				</div>
			</div>
		</c:forEach>
		<table>
			<tr>
				<td>${pagebean.pageToolBar }</td>
				<td></td>
			</tr>
		</table>
		<br />
		<div class="panel panel-info grid-6">
			<h5 class="panel_head">提交评论</h5>
			<div class="panel_body">
				<form action="addComment_use">
					<textarea name="comment.info" rows="6" cols="80"></textarea>
					<br /> <input type="hidden" name="comment.infoThesis.thesisId"
						value="${thesisId}"> <input type="hidden"
						name="comment.infoPeriodical.periodicalId" value="${periodicalId}">
					<input type="submit" class="button" value="提交">&nbsp;&nbsp;&nbsp;
					<input type="reset" class="button" value="取消"
						onclick="javascript:history.go(-1);">
				</form>
			</div>
		</div>
	</div>
	<!-- / .container -->
</body>
</html>
