package exercicio4;

public class Retangulo extends Forma {
	private double largura;
	private double altura;
	
	public Retangulo(Cor cor, double largura, double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}
	@Override
	public double area() {
		return largura * altura;
	}
	
}


