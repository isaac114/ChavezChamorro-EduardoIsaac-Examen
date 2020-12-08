package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOFactory;
import entidades.Telefono;

/**
 * Servlet implementation class BuscarUser
 */
@WebServlet("/BuscarUser")
public class BuscarUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/Busqueda.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String telefono = request.getParameter("telefono");
		String cedula = request.getParameter("cedula");
		System.out.println(telefono+"]]]]"+cedula);
		Telefono t = DAOFactory.getFactory().getTelefonoDAO().buscarUsuario(cedula, telefono);
		if(t != null) {
			request.setAttribute("telefono", t);
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/MostrarUser.jsp?");
			rd.forward(request, response);
		}
	}

}
