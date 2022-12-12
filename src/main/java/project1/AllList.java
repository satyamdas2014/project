package project1;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project1java.Java1;

import project1java.inter;


@WebServlet("/alllist")
public class AllList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AllList() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		inter dao = new Java1();
		dao.connectdb();
		ResultSet result = dao.allcontent();
		request.setAttribute("result",result );
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/alltable.jsp");
  	  rd.forward(request, response);
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 }

}
