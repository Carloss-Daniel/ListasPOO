package exercicio1;
import java.util.Scanner;

public class ConversorDeMoeda {
	private double dolar;
	private double quantidade;
	
	public double conversao() {
		
		return (dolar + dolar * 0.06) * quantidade;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConversorDeMoeda c = new ConversorDeMoeda();

        System.out.print("Qual o valor do Dolar? ");
        c.dolar = sc.nextDouble();
        System.out.print("Quantos Dolares? ");
        c.quantidade = sc.nextDouble();
        
        System.out.printf("Voce pagara em reais = %.2f%n", c.conversao() );
        sc.close();
		
	}
}
