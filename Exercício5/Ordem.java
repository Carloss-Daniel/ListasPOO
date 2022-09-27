package exercicio5;

import java.util.ArrayList;
import java.util.Date;

public class Ordem {
	private Date momento;
	private StatusOrdem status;
	private Cliente cliente;
	private ArrayList<OrdemItem> itens;
	
	public Ordem(Date momento, StatusOrdem status,Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
		this.itens = new ArrayList<>();
		
	}
	
	
	public void adicionarItem(OrdemItem item) {
		itens.add(item);
		
	}
	public void removerItem(OrdemItem item) {
		itens.remove(item);
		
	}
	public double total() {
		double quant = 0;
		for (OrdemItem i : itens) {
			quant += i.subTotal();
		}
		return quant;		
	}
	 @Override
	    public String toString() {
	        String itensParaStr = "";
	        for(OrdemItem i : itens) {
	        	itensParaStr += String.format("%s, $%s, Quantidade: %s, Subtotal: $%s\n", i.produto.getNome(), i.produto.getPreço(), i.getQuantidade(), i.subTotal());
	        }
	        return String.format("Momento da Ordem: %s\nStatus da Ordem: %s\nCliente: %s\nOrdem itens:\n%s\nPreço Total: $%s\n", momento, status, cliente, itensParaStr, total());
	    }

}
