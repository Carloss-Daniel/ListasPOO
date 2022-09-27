package exercicio5;

public class OrdemItem {
	private int quantidade;
	private double preço;
	Produto produto;
	
	public OrdemItem(int quantidade, double produtoPreço, Produto produto) {
		this.quantidade = quantidade;
		this.preço = produtoPreço;
		this.produto = produto;		
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	public double subTotal() {
		return getQuantidade() * preço;
	}
	@Override
    public String toString() {
        return String.format("%s, %s, Quantidade: %s, Subtotal: $%s\n", produto.getNome(), produto.getPreço(), getQuantidade(),
                subTotal());
    }

}
