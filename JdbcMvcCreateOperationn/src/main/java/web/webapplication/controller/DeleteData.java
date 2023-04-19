package web.webapplication.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/DeleteData")
public class DeleteData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Resource(name="jdbc/project")
	private DataSource dataSource;  
	
    public DeleteData() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("page");
		if(param.equals("delete")) {
			getServletContext().getRequestDispatcher("/delete.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//initialize the database
			Connection con= DBConnect.initializeDatabase();
			
			PreparedStatement ps= con.prepareStatement("delete from second where sid=?");
			ps.setInt(1,Integer.valueOf(request.getParameter("sid")));
			ps.executeUpdate();
			
			
			PrintWriter out = response.getWriter(); //import it from java.io
			
			
			
			ps.close();
			con.close();
			
			//Get a writer pointer
			// to display the successful result
			
			out.println("the record is Deleted in the database as aboves");	
			
			}
			catch (Exception e) {
			e.printStackTrace();
		}
	}

}
