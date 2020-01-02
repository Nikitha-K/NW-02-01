

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeDetailsInput
 */
@WebServlet("/EmployeeDetailsInput")
public class EmployeeDetailsInput extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String name = request.getParameter("empname");
		String email = request.getParameter("email");
		int sal = Integer.parseInt(request.getParameter("sal"));
		String date = request.getParameter("date");
		//Object checkedRadioButton;
		String job = request.getParameter("job");
		//String tester = request.getParameter("tester");
		//String scrum = request.getParameter("scrum_master");
		
		
		out.println("Employee name is "+name+"<br>");
		out.println("Employee email-id is "+email+"<br>");
		out.println("Employee joining date is "+date+"<br>");
		//out.println("Employee job type is "+developer+"<br>");
		//out.println("Employee job type is "+tester+"<br>");
		out.println("Employee job type is "+job+"<br>");
		out.println("Employee Salary is "+sal);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	}


