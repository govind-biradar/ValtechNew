package fb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FaceBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FaceBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("Username ="+request.getParameter("name")+""+"Password ="+request.getParameter("pass"));
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String name = request.getParameter("name");
	    String pass = request.getParameter("pass");
	    if("Govind".equals(name)&& "root".equals(pass)) {
	    	request.getRequestDispatcher("welcome.jsp").forward(request, response);
	    	
	    }else {
	    	request.getRequestDispatcher("fblogin.jsp").forward(request, response);
		    
	    
	    } 
	    
	    
	}
	

}