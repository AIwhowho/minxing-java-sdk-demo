package com.callback;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MenuResponseServlet extends HttpServlet {

	public MenuResponseServlet() {
		super();
	}

	public void destroy() {
		super.destroy();
	}

	public void init() throws ServletException {
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		InputStream in = request.getInputStream();
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			StringBuilder sb = new StringBuilder();
			String line = null;
			while((line=br.readLine())!=null){
				sb.append(line);
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
