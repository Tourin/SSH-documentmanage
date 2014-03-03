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
		<c:redirect
			url="searchThesis_doc?thesis.infoAuthor.authorId=${param.authorId}&thesis.title=" />
	</c:if>
	<div class="container">
		<h2>查看论文</h2>

		<div class="clearfix">
			<table class="table table-fluid">
				<caption>论文信息列表</caption>
				<thead data-spy="fixedHead" data-wrapper="table"
					data-wrapper-class="table" data-target="#tbody-1">
					<tr>
						<th width="20%">标题</th>
						<th width="15%">作者</th>
						<th width="15%">专业</th>
						<th width="15%">学位</th>
						<th width="20%">附件</th>
						<th width="15%">操作</th>
					</tr>
				</thead>
				<tbody id="tbody-1" class="typo-center">
					<c:forEach var="thesis" items="${request.pagebean.list}">
						<tr>
							<td>${thesis.title}</td>
							<td>${thesis.infoAuthor.name}</td>
							<td>${thesis.specialty}</td>
							<td>${thesis.educational}</td>
							<td><a href="..${thesis.path}">下载</a></td>
							<td><a
								href="removeThesis_doc?thesis.thesisId=${thesis.thesisId}&pageNo=${pagebean.pageNo}&thesis.infoAuthor.authorId=${param.authorId}&thesis.title="
								class="typo-danger">删除</a><span class="rule-inline">|</span> <a
								href="editThesisPrepare_doc?thesis.thesisId=${thesis.thesisId}">修改</a><span
								class="rule-inline">|</span><a
								href="getComments_use?comment.infoThesis.thesisId=${thesis.thesisId}" class="typo-danger">查看评论</a></td>
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
