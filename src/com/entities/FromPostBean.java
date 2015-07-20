package com.entities;
/*<xml><FromUserName><![CDATA[ec57d9f0525ebb02a488cc737bd6c7f68e3be83a3b19c38ba4066912d0c5f24b61b6a9304e561ce993f46c48971ea362]]></FromUserName>
<SSOKeyValue>3181@view.htsc</SSOKeyValue>
<CreateTime>1397440294</CreateTime>
<MsgType><![CDATA[event]]></MsgType>
<Event><![CDATA[subscribe]]></Event></xml>
*/

public class FromPostBean {
	public String FromUserName;
	public String SSOKeyValue;
	public String CreateTime;
	public String MsgId;
	public String MsgType;
	public String EventKey;
	public String Event;
	public String Content;
	public String MXSSOToken;
	public String LoginName;
	
	public String toString(){
		String s=("---frompostbean---");
		s=s+"\nFromUserName="+FromUserName;
		s=s+"\nSSOKeyValue="+SSOKeyValue;
		s=s+"\nMXSSOToken="+MXSSOToken;
		s=s+"\nLoginName="+LoginName;
		s=s+"\nCreateTime="+CreateTime;
		s=s+"\nMsgId="+MsgId;
		s=s+"\nMsgType="+MsgType;
		s=s+"\nEventKey="+EventKey;
		s=s+"\nEvent="+Event;
		s=s+"\nContent="+Content;
		return s;
	}
	
}
