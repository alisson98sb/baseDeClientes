package br.com.baseclientes.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListagemDeClientesServlet
 */
@WebServlet("/listagem")
public class ListagemDeClientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Cliente> clientes = banco.getClientes();
		
		//chamar jsp de listagem de clientes
		request.setAttribute("clientes", clientes);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listagem.jsp");
		rd.forward(request, response);	
	}

}
