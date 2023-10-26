package NumberSystem;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OnLineTag
 */
@WebServlet("/OnLineTag")
public class OnLineTag extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
//    public OnLineTag() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String system = request.getParameter("system");
        int input1 = Integer.parseInt(request.getParameter("input1"));
        int input2 = Integer.parseInt(request.getParameter("input2"));
 
        int sum = input1 + input2;
        String result;
 
        switch (system) {
            case "dec":
                result = Integer.toString(sum);
                break;
            case "oct":
                result = Integer.toOctalString(sum);
                break;
            case "hex":
                result = Integer.toHexString(sum).toUpperCase();
                break;
            case "bin":
                result = Integer.toBinaryString(sum);
                break;
            case "pow2":
                result = Integer.toString((int) Math.pow(10, 2));
                break;
            case "pow6":
                result = Integer.toString((int) Math.pow(10, 6));
                break;
            case "pow9":
                result = Integer.toString((int) Math.pow(10, 9));
                break;
            case "pow12":
                result = Integer.toString((int) Math.pow(10, 12));
                break;
            case "pow-6":
                result = "1E-06"; // Scientific notation for 10^-6
                break;
            case "pow-9":
                result = "1E-09"; // Scientific notation for 10^-9
                break;
            default:
                result = "Invalid Selection";
                break;
        }
 
        request.setAttribute("result", result);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

		

}
