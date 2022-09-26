package exercicio2;

import java.util.Scanner;

public class Retangulo {
	private Double largura;
	private Double altura;
	
	
	public Double area() {
		return largura * altura;
		
	}
	public Double perimetro() {
		return 2 * (largura + altura);
	}
	
	public Double diagonal() {
		return Math.sqrt(altura * altura + largura * largura)
	}
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			Retangulo r = new Retangulo();
			
			System.out.println("Digite o valor da largura e altura:");
			r.largura = sc.nextDouble();
			r.altura = sc.nextDouble();
			
			System.out.printf("AREA = %.2f%n", r.area());
            System.out.printf("PERIMETRO = %.2f%n", r.perimetro());
            System.out.printf("DIAGONAL = %.2f%n", r.diagonal());
            sc.close();			
		}
}
