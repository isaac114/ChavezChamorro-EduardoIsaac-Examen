package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOFactory;
import dao.OperadoraDAO;
import dao.TelefonoDAO;
import dao.TipoTelefonoDAO;
import dao.UsuarioDAO;
import entidades.Operadora;
import entidades.Telefono;
import entidades.TipoTelefono;
import entidades.Usuario;

/**
 * Servlet implementation class RegistrarT
 */
@WebServlet("/RegistrarT")
public class RegistrarT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarT() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		String cedula = request.getParameter("ced");
		String apellido = request.getParameter("apellido");
		String telefono =  request.getParameter("telefono");
		String operadora = request.getParameter("operadora");
		String tipo = request.getParameter("tipo");
		System.out.println(nombre+"--"+cedula+"---"+telefono+"---"+operadora+"--"+tipo);
		OperadoraDAO od = DAOFactory.getFactory().getOperadoraDAO();
		Operadora op = od.buscarOperadora(operadora);
		TipoTelefonoDAO ttd = DAOFactory.getFactory().getTipoTelefonoDAO();
		TipoTelefono tt = ttd.buscarTipo(tipo);
		UsuarioDAO ud = DAOFactory.getFactory().getUsuarioDAO();
		Usuario us = ud.buscarPorCedula(cedula);
		System.out.println(op.getNombre()+"---"+tt.getNombre()+"---"+us.getNombre());
		
		TelefonoDAO td = DAOFactory.getFactory().getTelefonoDAO();
		Telefono telf = new Telefono(0,telefono,us,op,tt);
		td.create(telf);
		response.sendRedirect("http://localhost:8080/ChavezChamorro-EduardoIsaac-Examen/jsp/RegistrarTelefono.jsp?nombre="+nombre+"&ci="+cedula);
	}

}
