package exercicio4;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Quantidade de Formas: ");
        int quantidadeDeFormas = sc.nextInt();
        ArrayList<Forma> formas = new ArrayList<>();

        for (int i = 0; i < quantidadeDeFormas; i++) {
            System.out.printf("**Forma #%d, Dados:** \n", i + 1);
            System.out.print("Retangulo ou Triangulo (r/c)? ");
            sc.nextLine(); 
            String tipoDaForma = sc.nextLine();
            System.out.print("Cor (Preto/Azul/Vermelho)? ");
            String NomeDaCor = sc.nextLine();
            Cor cor = Cor.valueOf(NomeDaCor);

            if(tipoDaForma.equals("r")) {
                System.out.println("Escolha a Largura e a Altura: ");
                double largura = sc.nextDouble();
                double altura = sc.nextDouble();
                Retangulo r = new Retangulo(cor, largura, altura);
                formas.add(r);
            } 
            else if (tipoDaForma.equals("c")) {
                System.out.println("Escolha o valor do Raio: ");
                double raio = sc.nextDouble();
                Circulo c = new Circulo(cor, raio);
                formas.add(c);
            } 
            else {
                break;
            }
        }

        System.out.println("Area das Formas: ");
        for(Forma f : formas) {
            System.out.printf("%.2f%n",f.area());
        }
        sc.close(); 
		

	}

}
