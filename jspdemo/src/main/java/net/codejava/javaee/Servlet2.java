package net.codejava.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		/*PrintWriter out= response.getWriter();
		int m1=Integer.parseInt(request.getParameter("m1"));
		int m2=Integer.parseInt(request.getParameter("m2"));
		int m3=Integer.parseInt(request.getParameter("m3"));
		int m4=Integer.parseInt(request.getParameter("m4"));
		int m5=Integer.parseInt(request.getParameter("m5"));
		int total =m1+m2+m3+m4+m5;
		out.println("total  is:" + total);
		int avg=total/5;
		out.print("Average is:" + avg);
		int[] nums={m1,m2,m3,m4,m5};
		Arrays.sort(nums);
		out.println("Minimum = " + nums[0]);
		out.println("Maximum = " + nums[nums.length-1]);  
		String average=String.valueOf(avg);
		request.setAttribute("Average is :", average);
		*/
		RequestDispatcher rd= request.getRequestDispatcher("final.jsp");
		rd.forward(request, response);
	    
	
	
	}
	

}
