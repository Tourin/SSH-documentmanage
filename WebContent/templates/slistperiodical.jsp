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
	${message}
	<c:if test="${empty requestScope.pagebean}">
		<c:redirect url="listPeriodicalPrepare_use" />
	</c:if>
	<div class="container">
		<h2>查看论文</h2>

		<form class="panel panel-ctrl" action="searchPeriodical_use">
			<fieldset>
				<label>输入发刊单位：</label><input name="per.infoUnit.name"
					class="text-input grid-2" type="text" /> <label>类型：</label><input
					name="per.type" class="text-input grid-2" type="text" />
				<button class="button js-loading-trigger" type="submit">查询</button>
			</fieldset>
		</form>
		<div class="clearfix">
			<table class="table table-fluid">
				<caption>期刊信息列表</caption>
				<thead data-spy="fixedHead" data-wrapper="table"
					data-wrapper-class="table" data-target="#tbody-1">
					<tr>
						<th width="20%">名称</th>
						<th width="15%">期数</th>
						<th width="15%">发刊单位</th>
						<th width="15%">类型</th>
						<th width="20%">附件</th>
						<th width="15%">操作</th>
					</tr>
				</thead>
				<tbody id="tbody-1" class="typo-center">
					<c:forEach var="per" items="${request.pagebean.list}">
						<tr>
							<td>${per.name}</td>
							<td>${per.number}</td>
							<td>${per.infoUnit.name}</td>
							<td>${per.type}</td>
							<td><a href="..${per.path}">下载</a></td>
							<td><a
								href="getComments_use?comment.infoPeriodical.periodicalId=${per.periodicalId}">查看评论</a></td>
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
