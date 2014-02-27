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
<link rel="stylesheet" href="../scripts/lib/jscal2/css/jscal2.css" />
<link rel="stylesheet" href="../scripts/lib/jscal2/css/win2k/win2k.css" />
<link rel="stylesheet" href="../scripts/lib/chosen/chosen.css" />
<script>
	(function() {
		var html = document.getElementsByTagName('html')[0];
		html.className = html.className.replace('no-js', 'js');
	})();
</script>
</head>
<body>
	<c:if test="${empty requestScope.pagebean}">
		<c:redirect url="listAuthorPrepare_adm" />
	</c:if>
	<div class="container">
		<h2>查看作者和论文</h2>

		<form class="panel panel-ctrl" action="searchAuthor_adm">
			<fieldset>
				<label>输入作者姓名：</label><input name="auth.name"
					class="text-input grid-2" type="text" placeholder="搜索提示信息" />

				<button class="button js-loading-trigger" type="submit">查询</button>
			</fieldset>
		</form>
		<div class="clearfix">
			<table class="table table-fluid">
				<caption>作者信息列表</caption>
				<thead data-spy="fixedHead" data-wrapper="table"
					data-wrapper-class="table" data-target="#tbody-1">
					<tr>
						<th width="20%">姓名</th>
						<th width="5%">年龄</th>
						<th width="20%">身份证号</th>
						<th width="15%">院校</th>
						<th width="15%">专业</th>
						<th width="5%">学历</th>
						<th width="20%">操作</th>
					</tr>
				</thead>
				<tbody id="tbody-1" class="typo-center">
					<c:forEach var="auth" items="${request.pagebean.list}">
						<tr>
							<td>${auth.name}</td>
							<td>${auth.age}</td>
							<td>${auth.idcard}</td>
							<td>${auth.school}</td>
							<td>${auth.specialty}</td>
							<td>${auth.educational}</td>
							<td><a href="#">查看详情</a> <span class="rule-inline">|</span>
								<a href="#" class="typo-danger">添加论文</a><span
								class="rule-inline">|</span> <a href="#">查看论文</a></td>
						</tr>
					</c:forEach>
				</tbody>
				<tfoot>
					<tr>
						<td class="typo-right" colspan="12">${pagebean.pageToolBar }</td>
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
	<!-- / .container -->

	<div class="loading" style="display: none;">正在加载...</div>
	<!-- / #loading -->

	<script src="../scripts/lib/require.js"></script>
	<script>
		require([ '../scripts/config' ], function(config) {
			require([ 'app/main/panel' ]);
		});
	</script>
</body>
</html>
