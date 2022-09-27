package exercicio5;

import java.util.Date;

public class Cliente {
	private String nome;
	private String email;
	private Date dataNascimento;
	
	public Cliente(String nome, String email, Date dataNascimento) {
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%s) - %s\n",nome, email, dataNascimento);
	}

}
