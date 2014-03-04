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
	<c:if test="${empty thesisList or empty perList}">
		<c:redirect url="recommend_use" />
	</c:if>
	<div class="container">
		<div class="panel panel-info grid-6">
			<h5 class="panel_head">论文推荐</h5>
			<div class="panel_body"></div>
		</div>
		<div class="panel panel-info grid-6">
			<h5 class="panel_head">期刊推荐</h5>
			<div class="panel_body"></div>
		</div>
	</div>
	<!-- / .container -->
</body>
</html>
