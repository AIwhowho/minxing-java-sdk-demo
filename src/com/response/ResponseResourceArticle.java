package com.response;

import java.util.HashMap;
import java.util.Map;

public class ResponseResourceArticle extends Response {


	public Response createHtmlMessage() {
		String content = "{"
				 +"\"article_count\": 4,"
				 +"\"articles\": ["
				   +"{"
				      +"\"title\": \"谷歌地图新服务1\","
				      +"\"description\": \"谷歌地图增加了一项显示任意两点之间距离1\","
				      +"\"pic_url\": \"http://ocu.dehuinet.com:8029/mx-test4dev/image/audi.jpg\","
				      +"\"app_url\": \"\","
				      +"\"url\": \"http://ocu.dehuinet.com:8029/mx-test4dev/html5/page7.jsp\""
				   +"},{"
				      +"\"title\": \"奥迪R8无线充电2\","
				      +"\"description\": \"奥迪正在开发一种感应无线充电系统2\","
				      +"\"pic_url\": \"http://ocu.dehuinet.com:8029/mx-test4dev/image/audi.jpg\","
				      +"\"app_url\": \"\","
				      +"\"url\": \"http://ocu.dehuinet.com:8029/mx-test4dev/html5/page1.jsp\""
				   +"},{"
				      +"\"title\": \"谷歌地图新服务3\","
				      +"\"description\": \"谷歌地图增加了一项显示任意两点之间距离3\","
				      +"\"pic_url\": \"http://ocu.dehuinet.com:8029/mx-test4dev/image/audi.jpg\","
				      +"\"app_url\": \"\","
				      +"\"url\": \"http://ocu.dehuinet.com:8029/mx-test4dev/html5/page7.jsp\""
				   +"},{"
				      +"\"title\": \"奥迪R8无线充电4\","
				      +"\"description\": \"奥迪正在开发一种感应无线充电系统4\","
				      +"\"pic_url\": \"http://ocu.dehuinet.com:8029/mx-test4dev/image/audi.jpg\","
				      +"\"app_url\": \"\","
				      +"\"url\": \"http://ocu.dehuinet.com:8029/mx-test4dev/html5/page1.jsp\""
				   +"}"
				 +"]"
				+"}";
		String contentType = "application/json";
		
		Response htmlMessage = new ResponseResourceArticle();
		htmlMessage.setContent(content);
		htmlMessage.setContentType(contentType);
		return htmlMessage;

	}

}
