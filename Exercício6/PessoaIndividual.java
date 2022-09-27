package exercicio6;

public class PessoaIndividual extends Pessoa {
	private String cpf;
	
	public PessoaIndividual(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public boolean isValid() {
		return ValidacaoCPF.isCPF(cpf);
	}
	 @Override
	 public String toString() {
		 return String.format("{Individual}, CPF: %s", this.cpf);
	 }
}

