package br.com.baseclientes.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Cliente> clienteLista = new ArrayList<>();
	
	static {}

	public void adiciona(Cliente cliente) {	
		Banco.clienteLista.add(cliente);
		System.out.println("Banco: Cliente " +cliente+ "cadastrado com sucesso");
	}
	
	public List<Cliente> getClientes() {
		System.out.println("Exibindo clientes: " + Banco.clienteLista);
		return Banco.clienteLista;
	}

}
