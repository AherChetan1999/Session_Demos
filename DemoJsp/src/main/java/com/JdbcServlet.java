package com;

import java.io.IOException;
import java.sql.DriverManager;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/s1")
public class JdbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	
    		
    		String user="cham";
    		ArrayList<String> a1= new ArrayList<>();
    		a1.add("cham");
    		a1.add("ram");
    		a1.add("varun");
    		request.setAttribute("user", user);
    		request.setAttribute("myList", a1);

    		RequestDispatcher rd= request.getRequestDispatcher("view3.jsp");
    		rd.forward(request,response);
    		
    		
    		
    		
    		
    		/*try {
    			Class.forName("com.mysql.cj.jdbc.Driver");
    		    }catch (Exception e) {
					// TODO: handle exception
				}
    		
		try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root","1234");
				Statement st= conn.createStatement();)
				{
					ArrayList slist= new ArrayList();
					Resultset rs = st.executeQuery("select * from Student");
					while(rs.next()) {
						Student s= new Student();
						s.setSid(rs.getInt(1));
						s.setName(rs.getString(2));
						s.setqualification(rs.getString(3));
						s.setplaced(rs.getString(4));
						slist.add(s);
					}
					request.setAttribute("studentlist", slist);
					request.setAttribute("user", "chetan")
					RequestDispatcher rd = request.getRequestDispatcher("view2.jsp");
					rd.forward(request, response);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				
	*/
    	
    	
    	}

	private void getRequestDispatcher(String string) {
			// TODO Auto-generated method stub
			
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
