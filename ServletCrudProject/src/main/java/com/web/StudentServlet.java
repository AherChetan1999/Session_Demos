package com.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.controller.Student;
import com.dao.StudentDao;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDao student;
       
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String action= request.getServletPath();
	   switch(action) 
	   {
	   case "/new":
		   show(request,response);
		   break;
	   case "/insert":
		   try {
			insertStudent(request,response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   break;
	   case "/delete":
		deleteStudent(request,response);
		   
		   break;
	   case "/update":
		   try {
			updateStudent(request,response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	       break;
	       
	       default:
		try {
			liststudent(request,response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    	   
	    	   break;
	   		
	   
	   }
	   
	   
	}
	
	
	private void show(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		  int id= Integer.parseInt(request.getParameter("sid"));
		  Student student;
		  student=StudentDao.selectUser(id);
		  RequestDispatcher dis = request.getRequestDispatcher("student-form.jsp");
				dis.forward(request, response);		
	}
	
	
	private void insertStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException {
		int id= request.getIntHeader("sid"); 
		String name= request.getParameter("sname");
		String qualification= request.getParameter("qualification");
		String placed= request.getParameter("placed");
		
		Student stud=new Student(id,name,qualification,placed);
		StudentDao studentDao = new StudentDao();
		studentDao.insertstudent(stud);
		response.sendRedirect("list");
	}
	
	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		int id=Integer.parseInt(request.getParameter("sid"));
		try {
			StudentDao studentDao = new StudentDao();
			studentDao.deleteStudent(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		response.sendRedirect("list");
		
	}
	
	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException{

		int id=Integer.parseInt(request.getParameter("sid"));
		String name= request.getParameter("sname");
		String qualification= request.getParameter("qualification");
		String placed= request.getParameter("placed");
		
		Student student= new Student(id,name,qualification,placed);
		StudentDao studentDao = new StudentDao();
		studentDao.updatestudent(student);
		
		
	}
	
	private void liststudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException{
	
			try {
					
				StudentDao studentDao = new StudentDao();
			
			List<Student> list= studentDao.studentsAll();
			request.setAttribute("studentlist", list);
			RequestDispatcher dis = request.getRequestDispatcher("student.jsp");
			dis.forward(request, response);
		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
