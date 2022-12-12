package project1java;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;


public class Java1 implements inter{
private Connection con;
private Statement stmnt;
	@Override
	public void connectdb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/registration15", "root", "test");
		             stmnt=  con.createStatement();
		}
		catch(Exception e) {
			
		}
	}

	@Override
	public boolean verifylogin(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
	         return result.next();
		}
catch(Exception e) {
	
}
		return false;
	}

	@Override
	public void update(String name, String city, String email, String mobile) {
           try {
        	   stmnt.executeUpdate("insert into registration values ('"+name+"', '"+city+"', '"+email+"', '"+mobile+"')");
           }
           catch(Exception e) {
        	   
           }
	}

	@Override
	public ResultSet allcontent(){
		
		try {
			ResultSet	result = stmnt.executeQuery("select * from registration");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return null;

		
	}

	
	

}
