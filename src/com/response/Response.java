package com.response;

import java.util.Map;

public class Response {
	private String contentType;
	private String content;
	private Map<String,String> headers;
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Map<String,String> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String,String> headers) {
		this.headers = headers;
	}
	
	
}
