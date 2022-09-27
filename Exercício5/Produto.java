package exercicio5;

public class Produto {
	private String nome;
	private double preço;
	
	 public Produto(String produtoNome, double produtoPreço) {
	        this.nome = produtoNome;
	        this.preço = produtoPreço;
	    }
	 public String getNome() {
	        return nome;
	    }

	    public double getPreço() {
	        return preço;
	    }

}
