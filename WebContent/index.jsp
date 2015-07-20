<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="common.jsp"%>
<title>敏行平台测试页面</title>
<script>
	$(document).ready(function(){
		
		$("#button").click(function(){
			var type=$("#type").val();
			var feedid=$("#feedid").val();
			var miniApps=$("input[name='miniApps']:checked").val();
			var showFeedFilter=$("input[name='showFeedFilter']:checked").val();
			var showAppFilter=$("input[name='showAppFilter']:checked").val();
			var url="message.jsp?type="+type+"&feedId="+feedid+"&miniApps="+miniApps+"&showFeedFilter="+showFeedFilter+"&showAppFilter="+showAppFilter;
			$("#testmessage").attr("href",url);
			$("#testmessage").html(url);
		});
		
		$("#opengraphdata").click(function(){
			localStorage.user=$("#user").val();
			localStorage.ocuId=$("#ocuId").val();
			localStorage.thirdurl=$("#thirdurl").val();
			localStorage.imageurl=$("#imageurl").val();
		});
		
		if (localStorage) {  
			$("#basedata").click(function(){
				localStorage.network=$("#network").val();
				localStorage.url=$("#url").val();
			});
			if(localStorage.user){
				$("#user").val(localStorage.user);
			}
			if(localStorage.ocuId){
				$("#ocuId").val(localStorage.ocuId);
			}
			if(localStorage.thirdurl){
				$("#thirdurl").val(localStorage.thirdurl);
			}
			if(localStorage.network){
				$("#network").val(localStorage.network);
			}
			if(localStorage.url){
				$("#url").val(localStorage.url);
			}
			if(localStorage.imageurl){
				$("#imageurlurl").val(localStorage.imageurl);
			}
		}else{
			alert("该浏览器不支持localStorage,请使用chrome测试！");
		}
	})
</script>
</head>
<body>

<h2>全局设置</h2>
敏行平台地址:<input name="url" id="url" value="http://intg.dehuinet.com:8060" size=100><br>
社区id:<input name="network" id="network" value="test.com" size=100><br>
<input id="basedata" name="basedata" type="button" value="点我保存">

<h2>Open Graph测试</h2>
<form id="opengrahp" name="opengraph">
在线用户:<input name="user" id="user" value="1061" size=100><br>
公众号ocuid:<input name="ocuId" id="ocuId" value="631b9f88bba58444d671d04d8688d82a" size=100><br>
opengraph打开的地址:<input name="thirdurl" id="thirdurl" value="http://192.168.100.99:8080/oatest/opengraph/opengraph.jsp" size=100><br>
opengraph图片:<input name="imageurl" id="imageurl" value="https://www.minxing365.com/apple-touch-icon-144.png" size=100><br>
<input id="opengraphdata" name="opengraphdata" type="button" value="点我保存">
</form>
<a href="opengraph/opengraph_frame.jsp">opengraph_frame.jsp test</a>
<br><a href="opengraph/opengraph_widget.jsp">opengraph_widget.jsp test</a>
<br><a href="opengraph/opengraph_im.jsp">opengraph_im.jsp test</a>
<form>
<!-- 
<h2>消息流测试</h2>
<br>type: following、my_all、created_by_me、all、conversations、group、user、topic<br>
<select id="type">
	<option value="following">following</option>
	<option value="my_all">my_all</option>
	<option value="created_by_me">created_by_me</option>
	<option value="all">all</option>
	<option value="conversations">conversations</option>
	<option value="group">group</option>
	<option value="user">user</option>
	<option value="topic">topic</option>
</select>
<br>miniApps: update  ALL
<input type="radio" name="miniApps" value="update" checked=checked>update
<input type="radio" name="miniApps" value="ALL">ALL
<br>showFeedFilter: true false
<input type="radio" name="showFeedFilter" value="true" checked=checked>true
<input type="radio" name="showFeedFilter" value="false">false
<br>showAppFilter: true false
<input type="radio" name="showAppFilter" value="true" checked=checked>true
<input type="radio" name="showAppFilter" value="false">false
<br>
当type为group、user、topic的时候需要指定feedId,从系统对应的记录的url中获取<br>
feedid:<input type="text" name="feedid" id="feedid" value="">
<br><br>
<input type="button" id="button" value="check url and click the url"><br>
<a href="#" id="testmessage">url</a><br>
</form>

<h2>JSSDK测试</h2>
<a href="JSsdk.jsp">JSsdk.jsp test</a>

<h2>模拟自动给某人发送消息</h2>
<a href="TestAppThirdAccount.jsp">点击测试</a>

<h2>模拟推送公众号 用户输入数据</h2>
<a href="upload.jsp">上传图文消息的图片</a><br>
<a href="ocu/ocu.jsp?t=textToUsers">文本信息</a><br>
<a href="ocu/ocu.jsp?t=multiArticleToUsers">图文</a><br>
<a href="ocu/ocu.jsp?t=multiArticleResourceToUsers">图文资源</a><br>

<div style="display:none">
<h2>模拟推送 使用xml数据</h2>
<a href="ocu/ocuToUsers.jsp?type=textToUsers">文本信息</a><br>
<a href="ocu/ocuToUsers.jsp?type=articleToUsers">单图文</a><br>
<a href="ocu/ocuToUsers.jsp?type=multiArticleToUsers">多图文</a><br>
<a href="ocu/ocuToUsers.jsp?type=articleResourceToUsers">单图文资源</a><br>
<a href="ocu/ocuToUsers.jsp?type=multiArticleResourceToUsers">多图文资源</a><br>
</div>
 -->
</body>
</html>