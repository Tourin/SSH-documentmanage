<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<HEAD>
<TITLE>论文期刊管理系统</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312">

<link rel="stylesheet" href="framework/css/style.css" type="text/css">
</HEAD>
<body
	style="background: #FFF url('framework/images/login_back1.jpg') no-repeat;">

	${message}
	<div id="content">
		<form action="login_acc" method="post">
			<table cellspacing=0 cellpadding=0 width=550 align=center border=0>
				<tr valign=top>

					<td width="92%" height=276 colspan="2" align=left
						background="framework/images/03-a.bmp">
						<table cellspacing=0 cellpadding=0 width="53%" border=0
							align="left">

							<tr>
								<td colspan=3 height="40">&nbsp;</td>
							</tr>
							<tr>
								<td class=a1 align=middle width="100%" colspan="3"><h3>论文期刊管理系统</h3></td>
							</tr>

							<tr>
								<td class=a1 align=middle width="11%">&nbsp;</td>
								<td class=a1 align=middle width="21%"><font class=a2
									color=#55728a>用户名：</font></td>
								<td class=a1 width="68%"><input style="WIDTH: 68%"
									maxlength=12 size=8 name="user.name"></td>
							</tr>
							<tr>
								<td class=a1 align=middle width="11%" height=38>&nbsp;</td>
								<td class=a1 align=middle width="21%" height=38><font
									class=a2 color=#55728a>密&nbsp;&nbsp;码：</font></td>
								<td class=a1 width="68%" height=38><input
									style="WIDTH: 68%" type=password maxlength=16
									name="user.pass"></td>
							</tr>
							<tr>
								<td class=a1 align=middle width="11%" height=38>&nbsp;</td>
								<td class=a1 align=middle width="21%" height=38><font
									class=a2 color=#55728a>身&nbsp;&nbsp;份：</font></td>
								<td class=a1 width="68%" height=38><select
									name="role">
										<option value="2">读者</option>
										<option value="1">管理员</option>
								</select></td>
							</tr>

							<tr align=middle>
								<td class=a1 width="11%" height="37">&nbsp;</td>
								<td class=a1 width="21%" height="37"><b></b></td>
								<td class=a1 valign=bottom align=left width="68%" height=37>
									<input type="submit" value=登录 name=Submit style="cursor: hand">
									<input type="reset" value="重置" name=Submit2
									style="cursor: hand">
								</td>
							</tr>

						</table>
					</td>
				</tr>
				<tr valign=top>
					<td align=right height=18 valign="bottom" class=b><p>
							<font size="-1">Copyright&nbsp;&nbsp;2014. All Rights
								Reserved </font>
						</p></td>
					<td width="20" class=b>&nbsp;</td>
				</tr>
			</table>
		</form>
	</div>

</BODY>
</html>
