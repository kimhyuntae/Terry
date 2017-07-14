package kdata.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */


//		http://localhost:7777/day0714/MyServlet 웹에 이렇게 치고 엔터

//@WebServlet("/test.kht")	//디렉토리 패턴, 이것이 URL  이제 http://localhost:7777/day0714/test.kht
@WebServlet("/test.kht")	//위에것을 이렇게도 가능 , (/와  *는 같이 사용 불가)
public class MyServlet extends HttpServlet {	//추상클래스
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
        
        System.out.println("MyServlet()");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init()");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
        System.out.println("destroy()");

	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        System.out.println("service()");

	}*/

	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html; charset=UTF-8");	//이제 한글 안깨짐 
		/*System.out.println("doGet()");
        PrintWriter out = response.getWriter();
        out.print("first servlet 다라라");		//브라우저에 나옴
        */
        String st = request.getParameter("t1");
        System.out.println(st);
        
        PrintWriter out = response.getWriter();
        out.print(st);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);	//위에 doget 메소드를 부름
        //System.out.println("doPost()");
        
		request.setCharacterEncoding("UTF-8");
		request.getParameter("t1");
		request.getParameter("t2");
		
        String st = request.getParameter("t1");
        String st2 = request.getParameter("t2");
        System.out.println(st);
        System.out.println(st2);
        
        PrintWriter out = response.getWriter();
        out.print(st);
        out.print(st2);
	}
}














