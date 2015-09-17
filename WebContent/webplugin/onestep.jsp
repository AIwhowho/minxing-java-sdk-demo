<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js">
<head>
<meta charset="utf-8">
<title>one step</title>
<meta name="description" content="">
<meta name="viewport"
	content="width=device-width,initial-scale=3.0, minimum-scale=3.0, maximum-scale=3.0, user-scalable=no" />
</head>
<body>
	<a href="#" onclick="back()">go back</a>
	<script type="text/javascript">
		function back(){
			/* history.go(-1); */
			var nav = window.navigator;
			
			if( window.cordova &&
			    nav &&
			    nav.app &&
			    nav.app.backHistory ){
				alert(nav.app.backHistory);
			    nav.app.backHistory();
			} else {
			    window.history.back();
			} 
		}
		/* window.onerror=testError;   

	    function testError(){   

		    arglen=arguments.length;
	
		    var errorMsg="参数个数："+arglen+"个";   
	
		    for(var i=0;i<arglen;i++){   
	
		    	errorMsg+="\n参数"+(i+1)+"："+arguments[i];   
	
			}   

		    alert(errorMsg);   
	
		    window.onerror=null;   
	
		    return true;  
	
		} */
	</script>
</body>
</html>