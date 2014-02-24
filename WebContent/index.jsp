<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <title>Backstage</title>
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

    <h1 class="sitename fleft">论文期刊管理系统</h1>

    <div class="userinfo fright shame-dbmrgn">
      欢迎您，用户名&nbsp;[角色]
      <span class="rule-inline">|</span>
      <a href="#" target="_blank">站点首页</a>
      <span class="rule-inline">|</span>
      <a href="#">退出</a>
    </div><!-- / .userinfo -->

    <div class="tab-nav">
      <h2 class="tab_title is-tab_title-on">
        <a data-toggle="tab"
          data-indicator="h2"
          data-active-title-class="is-tab_title-on"
          href="#nav-section-1"
          hidefocus>栏目一</a>
      </h2>
      <h2 class="tab_title">
        <a data-toggle="tab"
          data-indicator="h2"
          data-active-title-class="is-tab_title-on"
          href="#nav-section-2"
          hidefocus>栏目二</a>
      </h2>
    </div><!-- / .tab-nav -->
  </div><!-- / .header -->

  <div class="aside">
    <div class="tab_pane on" id="nav-section-1">
      <div class="accordion accordion-menu"
        data-active-head-class="is-accordion_head-on"
        data-show-active-only="true">
        <h3 class="accordion_head is-accordion_head-on"
          data-toggle="accordion"
          data-parent=".accordion">菜单一</h3>
        <div class="accordion_body on">
          <a class="menu_item is-menu_item-on js-loading-trigger" href="templates/readme.html" target="mainframe" hidefocus>简介</a>
          <a class="menu_item js-loading-trigger" href="templates/typography.html" target="mainframe" hidefocus>字体排印</a>
          <a class="menu_item js-loading-trigger" href="templates/layout.html" target="mainframe" hidefocus>排版布局</a>
        </div>

        <h3 class="accordion_head"
          data-toggle="accordion"
          data-parent=".accordion">菜单二</h3>
        <div class="accordion_body">
          <a class="menu_item js-loading-trigger" href="templates/icon.html" target="mainframe" hidefocus>图标</a>
          <a class="menu_item js-loading-trigger" href="templates/button.html" target="mainframe" hidefocus>按钮</a>
          <a class="menu_item js-loading-trigger" href="templates/tab.html" target="mainframe" hidefocus>选项卡</a>
          <a class="menu_item js-loading-trigger" href="templates/accordion.html" target="mainframe" hidefocus>折叠</a>
          <a class="menu_item js-loading-trigger" href="templates/dialog.html" target="mainframe" hidefocus>对话框</a>
          <a class="menu_item js-loading-trigger" href="templates/panel.html" target="mainframe" hidefocus>面板</a>
          <a class="menu_item js-loading-trigger" href="templates/table.html" target="mainframe" hidefocus>表格</a>
          <a class="menu_item js-loading-trigger" href="templates/form.html" target="mainframe" hidefocus>表单</a>
          <a class="menu_item js-loading-trigger" href="templates/calendar.html" target="mainframe" hidefocus>日历</a>
        </div>
      </div>
    </div>

    <div class="tab_pane" id="nav-section-2">
      <div class="accordion accordion-menu"
        data-active-head-class="is-accordion_head-on"
        data-show-active-only="true">
        <h3 class="accordion_head is-accordion_head-on"
          data-toggle="accordion"
          data-parent=".accordion">菜单一</h3>
        <div class="accordion_body on">
          <a class="menu_item js-loading-trigger" href="templates/login.html" target="mainframe" hidefocus>登陆(@todo)</a>
        </div>
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
    <iframe name="mainframe" class="main" src="templates/readme.html" frameborder="0"></iframe>
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
