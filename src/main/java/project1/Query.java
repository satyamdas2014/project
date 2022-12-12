package project1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project1java.Java1;
import project1java.inter;

@WebServlet("/project")
public class Query extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Query() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	inter dao = new Java1();
	dao.connectdb();
	boolean status = dao.verifylogin(email, password);
      if(status==true) {
    	  RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/registration.jsp");
    	  rd.forward(request, response);
      }
      else {
    	  request.setAttribute("error", "invalid usernamae/password");
    	  RequestDispatcher rd = request.getRequestDispatcher("project.jsp");
    	  rd.forward(request, response);
      }
	
	}

}
