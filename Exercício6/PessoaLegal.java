package exercicio6;

public class PessoaLegal extends Pessoa {
	private String cnpj;
	
	public PessoaLegal(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public boolean isValid() {
		return ValidacaoCNPJ.isCNPJ(cnpj);
	}
	@Override
    public String toString() {
        return String.format("{Legal}, CNPJ: %s", this.cnpj);
    }

}

