

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionZuServlet2
 */
@WebServlet("/session")
public class SessionZuServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionZuServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		String nachname = "" + session.getAttribute("nachname");
		String vorname = request.getParameter("vorname");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html><html><head><meta charset=\"UTF-8\"><title>SessionzuServlet1</title></head><body> ");
		if((nachname==null)||(nachname.length()<2)|| (vorname==null) || (vorname.length()<2)) {
			out.print("<h1>Fehler: Du hast keinen Nachnamen und/oder Vornamen eingegeben!</h1>");
		}else {
			session.setAttribute("vorname", vorname);
			out.print("<h1>Hallo " + vorname+ " " + nachname+"</h1>");
			out.print("</body></html>");
		}
		
	}

}
