package myCalcultor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		
	//  type casting
			int a = Integer.parseInt(str1);
			int b = Integer.parseInt(str2);
			
			//int sum = num1+num2;
			int ans;
			
			if(str3.equals("1")) ans = a+b;
			else if(str3.equals("2")) ans=a-b;
			else if(str3.equals("3")) ans=a*b;
			else ans=a/b;
 		
		//response.getWriter().append("Ans =  "+ans);
		response.sendRedirect("NewFile.jsp?ans="+ans);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
