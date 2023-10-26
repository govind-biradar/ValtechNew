package firstWebs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("User name ="+request.getParameter("name")+""+"Password ="+request.getParameter("pass"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * TODO if name and pass is wrong show the login page again with msg...
	 * if name is less than 4 char then add msg and login page 
	 * if pass is less than 8 char than msg and login page
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String name = request.getParameter("name");
	    String pass = request.getParameter("pass");
	    if("Govind".equals(name)&& "root".equals(pass)) {
	    	request.setAttribute("message","Hi Govind .. how have you been");
	    	request.getRequestDispatcher("loginResult.jsp").forward(request, response);
	    	
	    }else {
	    	request.setAttribute("message","only root is valid");
	    	
	    	if(name.length()<4) {
	    		request.setAttribute("Message1","username is less than 4 char");

	    		
//	    		 request.getRequestDispatcher("login.jsp").forward(request, response);
	    		
	  
	    	}
	    	if(pass.length()<4) {
	    		request.setAttribute("Message2","password is less than 4 char");

//	    		request.getRequestDispatcher("login.jsp").forward(request, response);
	    		
	        
	    	
	    	}
	    	
	    }
	    
              request.getRequestDispatcher("loginResult.jsp").forward(request, response);
	    
	    
	    
	    
	}
	

}
