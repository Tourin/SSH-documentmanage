$(function(){
      var $category=$(".proList > .plCon");
	  $category.hide();
	  var $toggleBtn=$(".plTitle > em");
	  $toggleBtn.click(function(){
	 if($(this).parent(".plTitle").next().is(":visible")){
	   $(this).parent(".plTitle").next().slideUp("slow");
	   $(this).prev(".plTitle > a").css("background","url(framework/images/icon1.gif) no-repeat left center");
	   $(this).css("background","url(framework/images/icon3.gif) no-repeat left center").text("展开");
	 }else{
	   $(this).parent(".plTitle").next().slideDown("slow");
	   $(this).prev(".plTitle > a").css("background","url(framework/images/icon4.gif) no-repeat left center");
	   $(this).css("background","url(framework/images/icon2.gif) no-repeat left center").text("收起");
	 }
	 return false;
	});
})
