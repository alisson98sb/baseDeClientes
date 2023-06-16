package br.com.baseclientes.servlet;

public class Cliente {
	private String clientName;
	private String clientCity;
	private String clientePhone;
	private int id;
	
	public String getClientName() {
		return clientName;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getClientCity() {
		return clientCity;
	}
	
	public void setClientCity(String clientCity) {
		this.clientCity = clientCity;
	}
	
	public String getClientePhone() {
		return clientePhone;
	}
	
	public void setClientePhone(String clientePhone) {
		this.clientePhone = clientePhone;
	}
}
