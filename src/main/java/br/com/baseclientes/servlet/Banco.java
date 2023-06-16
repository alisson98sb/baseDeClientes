package br.com.baseclientes.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Cliente> clienteLista = new ArrayList<>();
	
	static {
		Cliente cliente1 = new Cliente();
		cliente1.setClientName("Anderson Dalosse");
		
		Cliente cliente2 = new Cliente();
		cliente2.setClientName("Sabrina Almeida");
		
		clienteLista.add(cliente1);
		clienteLista.add(cliente2);
	}
	
	public void adiciona(Cliente cliente) {	
		Banco.clienteLista.add(cliente);
		System.out.println("Banco: Cliente " +cliente+ "cadastrado com sucesso");
	}
	
	public List<Cliente> getClientes() {
		System.out.println("Exibindo clientes: " + Banco.clienteLista);
		return Banco.clienteLista;
	}
	
}
