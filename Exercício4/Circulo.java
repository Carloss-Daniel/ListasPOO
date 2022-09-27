package exercicio4;

public class Circulo extends Forma {

	private Double raio;
	
	public Circulo(Cor cor, double raio) {
        super(cor);
        this.raio = raio;
    }
	
	@Override
	public double area() {
		return Math.PI * (raio * raio);
	}

}
