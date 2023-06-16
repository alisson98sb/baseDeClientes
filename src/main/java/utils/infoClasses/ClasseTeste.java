package utils.infoClasses;

import java.util.ArrayList;

public class ClasseTeste {
	private String nome;
	private String cidade;
	
	public ClasseTeste(String name, String city) {
		this.nome = name;
		this.cidade = city;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
