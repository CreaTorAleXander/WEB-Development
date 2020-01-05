

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuswertungFormular
 */
@WebServlet("/AuswertungFormular")
public class AuswertungFormular extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuswertungFormular() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=ISO-8859-1");
		PrintWriter out = response.getWriter();
		out.println("<!Doctype html>" +
						"<html>"	  +	
							"<head>"  +
								"<meta charset=\"ISO-8859-1\">"	+ 
								"<title>Antwort vom Servlet </title>"+
								
							"</head>"		+
							"<body>");
		String parameter = request.getParameter("name");
		if((parameter==null)||(parameter.length()<1)) {
			out.println("<h2>Sie haben <em>nix</em> eingegeben.</h2>");
			out.println("<a href=\"Form.html\">zurück...</a>");
		}
		else {
			out.println("<h2>Sie haben <em>"+parameter+"</em> eingegeben!</h2>");
			out.println("<a href=\"Form.html\">zurück...</a>");
			out.println("</body></html>");
			//Schließen des output streams
			out.close();

		}
		
		// doGet(request, response);
	}

}
