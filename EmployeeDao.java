package net.javaguides.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.javaguides.registration.model.Employee;

public class EmployeeDao {
	public int registerEmployee(Employee employee)throws ClassNotFoundException{
		String INSERT_USERS_SQL = "INSERT INTO employee" + "(id, first_name, address, gender,salary, birthdate)VALUES"+"(?,?,?,?,?,?);";
		int result = 0 ; 
		Class.forName("com.mysql.jdbc.Driver");
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees?useSSL=false", "root","@Nayra02");
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
			preparedStatement.setInt(1,1);
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getAddress());
			preparedStatement.setString(4, employee.getGender());
			preparedStatement.setString(5, employee.getSalary());
			preparedStatement.setString(6, employee.getDOB());
			
			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();
		
				
	}catch(SQLException e) {
		e.printStackTrace();
	}
		return result;
		
	}

}
