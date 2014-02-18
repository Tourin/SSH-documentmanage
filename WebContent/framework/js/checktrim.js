function a(){   
  	  var controls = document.getElementsByTagName('input');
        for(var i=0; i<controls.length; i++){   
           if(controls[i].type=='text'||controls[i].type=='textarea'){   
               controls[i].value=controls[i].value.Trim();//循环调用Trim()方法去除前后空格,替换   
          }   
        }
       } 