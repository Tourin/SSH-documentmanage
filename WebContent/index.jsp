<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <title>期刊论文管理系统</title>
  <link rel="stylesheet" href="styles/backstage.css" />
  <style>
    html, body {
      border: none;
      height: 100%;
      width: 100%;
    }
  </style>
  <script>
    (function() {
      var html = document.getElementsByTagName('html')[0];
      html.className = html.className.replace('no-js', 'js');
    })();
  </script>
</head>
<body class="index">
  <div class="header clearfix">
    <a class="logo fleft" href="#" target="_blank">
      <img src="images/logo.png" alt="Logo" width="136" height="80" />
    </a><!-- / .logo -->

    <h1 class="sitename fleft">期刊论文管理系统</h1>

    <div class="userinfo fright shame-dbmrgn">
      欢迎您，${admin.name}${user.name}&nbsp;
      <span class="rule-inline">|</span>
      <a href="index.jsp">站点首页</a>
      <span class="rule-inline">|</span>
      <a href="logout_acc">退出</a>
    </div><!-- / .userinfo -->

  </div><!-- / .header -->

  <div class="aside">
    <div class="tab_pane on" id="nav-section-1">
      <div class="accordion accordion-menu"
        data-active-head-class="is-accordion_head-on"
        data-show-active-only="true">
        <h3 class="accordion_head is-accordion_head-on"
          data-toggle="accordion"
          data-parent=".accordion">菜单</h3>
        <div class="accordion_body on">
          ${rights}
        </div>
        <h3 class="accordion_head"
          data-toggle="accordion"
          data-parent=".accordion">个人资料</h3>
        <div class="accordion_body">
          ${rights2}
        </div>
      </div>
    </div>

    <div class="tab_pane" id="nav-section-2">
      <div class="accordion accordion-menu"
        data-active-head-class="is-accordion_head-on"
        data-show-active-only="true">
        <h3 class="accordion_head is-accordion_head-on"
          data-toggle="accordion"
          data-parent=".accordion"></h3>
      </div>
    </div>
  </div><!-- / .aside -->

  <a class="aside_switch is-aside_switch-on"
    title="关闭/打开侧边栏">
  </a><!-- / .aside_switch -->

  <div class="crumb">
    <i class="icon icon-home"></i>&nbsp;
    <span id="crumb">首页</span>
    <!--[if lt IE 8]><div class="fright"></div><![endif]-->
  </div><!-- / .crumb -->

  <div class="maincontainer">
    <iframe name="mainframe" class="main" src="about.html" frameborder="0"></iframe>
  </div><!-- / .maincontainer -->

  <div class="loading" style="display: none;">正在加载...</div><!-- / #loading -->

  <script src="scripts/lib/require.js"></script>
  <script>
    require.config({
      baseUrl: 'scripts/lib',
      paths: {
        'app': '../app',
        'jquery': [
          'http://cdn.staticfile.org/jquery/1.10.2/jquery.min',
          'jquery'
        ]
      },
      shim: {
        'jquery.accordion': { deps: ['jquery'] },
        'jquery.tab': { deps: ['jquery'] }
      }
    });

    require(['app/main/index']);
  </script>
</body>
</html>
