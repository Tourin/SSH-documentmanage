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
		<c:redirect url="listUnitPrepare_adm" />
	</c:if>
	<div class="container">
		<h2>查看发刊单位期刊</h2>

		<form class="panel panel-ctrl" action="searchUnit_adm">
			<fieldset>
				<label>输入单位名称：</label><input name="unit.name"
					class="text-input grid-2" type="text" placeholder="搜索提示信息" />

				<button class="button js-loading-trigger" type="submit">查询</button>
			</fieldset>
		</form>
		<div class="clearfix">
			<table class="table table-fluid">
				<caption>发刊单位信息列表</caption>
				<thead data-spy="fixedHead" data-wrapper="table"
					data-wrapper-class="table" data-target="#tbody-1">
					<tr>
						<th width="30%">单位名称</th>
						<th width="15%">单位规模</th>
						<th width="30%">涉及领域</th>
						<th width="25%">操作</th>
					</tr>
				</thead>
				<tbody id="tbody-1" class="typo-center">
					<c:forEach var="unit" items="${request.pagebean.list}">
						<tr>
							<td>${unit.name}</td>
							<td>${unit.scale}</td>
							<td>${unit.industry}</td>
							<td><a
								href="removeUnit_adm?unit.unitId=${unit.unitId}&pageNo=${pagebean.pageNo}"
								class="typo-danger">删除</a><span class="rule-inline">|</span> <a
								href="editUnitPrepare_adm?unit.unitId=${unit.unitId}">查看详情</a> <span
								class="rule-inline">|</span> <a
								href="<c:url value="addperiodical.jsp">
           						<c:param name="unitId" value="${unit.unitId}"/>  
       							</c:url>"
								class="typo-danger">添加期刊</a><span class="rule-inline">|</span> <a
								href="<c:url value="listperiodical.jsp">
           						<c:param name="unitId" value="${unit.unitId}"/>  
       							</c:url>">查看期刊</a></td>
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
