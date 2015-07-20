package com.utils;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import com.entities.FromPostBean;
import com.minxing.client.ocu.Article;
import com.minxing.client.ocu.Resource;
import com.minxing.client.ocu.TextMessage;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Util {
	private static int BUFFER_SIZE = 1024;

	public static String InputStreamTOString(InputStream in, String encoding)
			throws Exception {

		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] data = new byte[BUFFER_SIZE];
		int count = -1;
		while ((count = in.read(data, 0, BUFFER_SIZE)) != -1)
			outStream.write(data, 0, count);

		data = null;
		return new String(outStream.toByteArray(), "utf-8");
	}
	
	 public static FromPostBean getFromPostBean(InputStream in){
		 XStream xStream = new XStream(new DomDriver());
		 xStream.alias("xml", FromPostBean.class);
		 return (FromPostBean)xStream.fromXML(in);
	 }
	 public static TextMessage getTextMessage(String filename){
		 String path = Util.class.getClassLoader().getResource(filename).getPath();
		 XStream xStream = new XStream(new DomDriver());
		 xStream.alias("xml", TextMessage.class);
		 try {
			 BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			return (TextMessage)xStream.fromXML(br);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	 }
	 public static Article getArticle(String filename){
		 String path = Util.class.getClassLoader().getResource(filename).getPath();
		 XStream xStream = new XStream(new DomDriver());
		 xStream.alias("xml", Article.class);
		 try {
			 BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			return (Article)xStream.fromXML(br);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	 }
	 public static Resource getResource(String filename){
		 String path = Util.class.getClassLoader().getResource(filename).getPath();
		 XStream xStream = new XStream(new DomDriver());
		 xStream.alias("xml", Resource.class);
		 try {
			 BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
			return (Resource)xStream.fromXML(br);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	 }
}
