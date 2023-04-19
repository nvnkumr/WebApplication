package web.webapplication.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/RetriveData")
public class RetriveData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Resource(name="jdbc/project")
	private DataSource dataSource;  
	
    public RetriveData() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("page");
		if(param.equals("retrivedata")) {
			getServletContext().getRequestDispatcher("/retrivedata.jsp").forward(request, response);
		}
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//initialize the database
			Connection con= DBConnect.initializeDatabase();
			
		
			Statement st = con.createStatement();
			String query= "SELECT * FROM second";
		
			ResultSet rs = st.executeQuery(query);
			
			PrintWriter out = response.getWriter(); //import it from java.io
			
			while (rs.next())
			{
				System.out.println("ID is "+rs.getInt("sid"));
				System.out.println("String is "+rs.getString("sname"));
				
				out.println("ID is "+rs.getInt("sid"));
				out.println("String is "+rs.getString("sname"));
			}
			
			
			st.close();
			con.close();
			
			//Get a writer pointer
			// to display the successful result
			
			out.println("All the records in the database are aboves");	
			
			}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
