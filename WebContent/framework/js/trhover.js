var rows = document.getElementsByTagName('tr');
for (var i=0;i<rows.length;i++){
rows[i].onmouseover = function(){  //鼠标在行上面的时候
this.className += 'altrow';
}
rows[i].onmouseout = function(){  //鼠标离开时
this.className = this.className.replace('altrow','');
}
}