package br.com.baseclientes.clienteServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cliente
 */
@WebServlet("/cliente")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String clientName = request.getParameter("nome");
		
		System.out.println("Cadastrando nova empresa: " + clientName);
		
		//chamar jsp
		RequestDispatcher rd = request.getRequestDispatcher("/cliente.jsp");
		rd.forward(request, response);
	}

}
