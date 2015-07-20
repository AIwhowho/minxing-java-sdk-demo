package com.response;

import java.util.HashMap;
import java.util.Map;

public class ResponseHtml extends Response {


	public static Response createMessage() {
		String content = "<h2>关于OA系统推广的动员会</h2>"
				+ "<br>时间：2014-12-12"
				+ "<br>类型：集团公文"
				+ "内容：集团各机构、各部门：随着集团规模不断发展壮大，业务领域不断拓展，为树立集团文明、高效、现代的对外形象，展现员工健康高雅的仪容仪表和礼仪风度。现拟定《诺信金融服务集团礼仪规范》供全体员工学习遵守。具体规定如下：    <br>一、本规范自下发之日起实行。    <br>二、请各职场遵照礼仪规范中规定的标准规范员工言行举止。    <br>三、请各机构、各部门负责人监督本部礼仪规范的执行情况。    <br>四、请各窗口部门严格遵守礼仪规范，并酌情计入员工绩效考核。    <br>五、本规范最终解释权归总裁办所有。附件一：《诺信金融服务集团礼仪规范》";
		
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "text/html;charset=utf-8");
		String contentType = "application/html";
		
		Response htmlMessage = new ResponseHtml();
		htmlMessage.setContent(content);
		htmlMessage.setContentType(contentType);
		htmlMessage.setHeaders(headers);
		return htmlMessage;

	}

}
