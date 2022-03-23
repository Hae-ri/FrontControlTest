package com.javatest.ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControl
 */
//@WebServlet("/FrontControl") // 디렉토리 패턴으로 맵핑
@WebServlet("*.do") // 확장자 패턴으로 맵핑 -> 모든 클라이언트 요청이 FrontControl 서블릿으로 집중하게 함


public class FrontControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FrontControl() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet Act");
		
		String uri = request.getRequestURI(); // uri 가져오기, localhost 제외한 주소
		System.out.println("uri : " + uri);
		String conPath = request.getContextPath(); // uri의 상대경로 가져오기, 루트 디렉토리
		System.out.println("conPath : " + conPath );
		String command = uri.substring(conPath.length()); // command 패턴 가져오기
		
		if(command.equals("/france.do")) {
			System.out.println("france.do 로 들어왔음!");
		}else if(command.equals("/Korea.do")) {
			System.out.println("Korea.do 로 들어왔음!");
		}else if(command.equals("/japan.do")) {
			System.out.println("japan.do 로 들어왔음!");
		}else if(command.equals("/usa.do")) {
			System.out.println("usa.do 로 들어왔음!");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost Act");
		doGet(request, response);
	}

}
