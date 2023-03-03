package net.javaguides.registration.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.javaguides.registration.dao.EmployeeDao;
import net.javaguides.registration.model.Employee;

import java.io.IOException;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeDao employeeDao = new EmployeeDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/employeeregister.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     
		String Id = request.getParameter("Id");
		String firstName = request.getParameter("firstName");
		String Address = request.getParameter("Address");
		String Gender = request.getParameter("Gender");
		String Salary = request.getParameter("Salary");
		String DOB = request.getParameter("DOB");
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName(firstName);
		employee.setAddress(Address);
		employee.setGender(Gender);
		employee.setSalary(Salary);
		employee.setDOB(DOB
				);
		
		try {
			employeeDao.registerEmployee(employee);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/employeedetails.jsp");
		dispatcher.forward(request, response);
		
	}

}
