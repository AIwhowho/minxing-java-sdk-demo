<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script src="<%=request.getContextPath() %>/js/jquery-2.1.0.js"></script>
<script>
var  user = localStorage.user;
var  ocuId = localStorage.ocuId;
var  network = localStorage.network;
var  url = localStorage.url;
var  thirdurl = localStorage.thirdurl;

var mx_loader = "/connect/mx_loader.js";
document.write('<script src="' + url + mx_loader +'" data-app-id="3" data-network="' + network + '"><' + '/script>');
</script>
