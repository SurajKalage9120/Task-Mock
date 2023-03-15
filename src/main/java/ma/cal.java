package ma;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cal
 */
@WebServlet("/cal")
public class cal extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double num1=Double.parseDouble(request.getParameter("num1"));
		double num2=Double.parseDouble(request.getParameter("num2"));
		String str=request.getParameter("op");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		double result=0;
		if(str.equals("+"))
			result=num1+num2;
		else if(str.equals("-"))
			result=num1-num2;
		else if(str.equals("*"))
			result=num1*num2;
		else
			result=num1/num2;
		out.print(result);
	}

}
