package com.response;


public class ResponseText extends Response {


	public static Response createMessage() {
		String content = "集团各机构、各部门：随着集团规模不断发展壮大，业务领域不断拓展。";
		
		String contentType = "application/text";
		
		Response htmlMessage = new ResponseText();
		htmlMessage.setContent(content);
		htmlMessage.setContentType(contentType);
		return htmlMessage;

	}

}
