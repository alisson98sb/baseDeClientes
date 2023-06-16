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
 * Servlet implementation class Cliente
 */
@WebServlet("/cliente")
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String clientName = request.getParameter("nome");
		
		System.out.println("Cadastrando nova empresa: " + clientName);
		
		Cliente cliente = new Cliente();
		cliente.setClientName(clientName);
		
		Banco banco = new Banco();
		banco.adiciona(cliente);
		
		
		//chamar jsp do cliente cadastrado
		RequestDispatcher rd = request.getRequestDispatcher("/cliente.jsp");
		request.setAttribute("nome", clientName);
		rd.forward(request, response);
	}

}
