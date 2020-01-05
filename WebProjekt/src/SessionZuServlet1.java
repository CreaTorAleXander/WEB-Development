

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionZuServlet1
 */
@WebServlet("/session1")
public class SessionZuServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionZuServlet1() {
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
		String nachname = request.getParameter("nachname");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html><html><head><meta charset=\"UTF-8\"><title>SessionzuServlet1</title></head><body> ");
		if((nachname==null)||(nachname.length()<2)) {
			out.print("<h1>Fehler: Du hast keinen Nachnamen eingegeben!</h1>");
		}else {
			session.setAttribute("nachname", nachname);
			String s ="";
			s+="<h1>Wie ist dein Vorname?</h1>";
			s+="<form action=\"session\" method=\"post\">";
			s+="<input type=\"text\" name=\"vorname\" />";
			s+="<input type=\"submit\" value=\"Senden...\" />";
			s+="</form></body></html>";
			out.print(s);
			out.close();
		}
	}

}
