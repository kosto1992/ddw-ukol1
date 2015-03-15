package contacts;

import gate.util.GateException;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetContactsServlet
 */
public class GetContactsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetContactsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context=request.getSession().getServletContext();
		String url = request.getParameter("url");
		if (url==null || url==""){
			request.setAttribute("error", "Please fill the URL");
		}
		ContactList contacts = new ContactList();
		String gate=null;
		GateClient client = new GateClient();
		try {
			gate = client.run(url, contacts);
		} catch (GateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contacts.generateCsvFileForEmails(context.getRealPath( "/emails.csv"));
		contacts.generateCsvFileForPhones(context.getRealPath( "/phones.csv"));
		request.setAttribute("gate", gate.replace("\n","<br/>"));
		
		request.getRequestDispatcher("/").forward(request, response);
    }

}
