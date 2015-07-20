package com.response;

import java.util.HashMap;
import java.util.Map;

public class ResponseArticle extends Response {


	public static Response createMessage() {
		String content = "{"
				 +"\"article_count\": 4,"
				 +"\"articles\": ["
				   +"{"
				      +"\"title\": \"谷歌地图新服务1\","
				      +"\"description\": \"谷歌地图增加了一项显示任意两点之间距离1\","
				      +"\"pic_url\": \"https://www.minxing365.com/logo.png\","
				      +"\"app_url\": \"\","
				      +"\"url\": \"https://www.minxing365.com/m\""
				   +"},{"
				      +"\"title\": \"奥迪R8无线充电2\","
				      +"\"description\": \"奥迪正在开发一种感应无线充电系统2\","
				      +"\"pic_url\": \"https://www.minxing365.com/logo.png\","
				      +"\"app_url\": \"\","
				      +"\"url\": \"http://mobile.baidu.com\""
				   +"},{"
				      +"\"title\": \"谷歌地图新服务3\","
				      +"\"description\": \"谷歌地图增加了一项显示任意两点之间距离3\","
				      +"\"pic_url\": \"https://www.baidu.com/img/bd_logo1.png\","
				      +"\"app_url\": \"\","
				      +"\"url\": \"http://mobile.baidu.com\""
				   +"},{"
				      +"\"title\": \"奥迪R8无线充电4\","
				      +"\"description\": \"奥迪正在开发一种感应无线充电系统4\","
				      +"\"pic_url\": \"http://www.sogou.com/images/logo/new/search400x150.png\","
				      +"\"app_url\": \"\","
				      +"\"url\": \"http://mobile.baidu.com\""
				   +"}"
				 +"]"
				+"}";
		String contentType = "application/json";
		
		Response htmlMessage = new ResponseArticle();
		htmlMessage.setContent(content);
		htmlMessage.setContentType(contentType);
		return htmlMessage;

	}

}
