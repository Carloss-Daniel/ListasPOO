package exercicio3;
import java.util.Scanner;
public class Empregado {
	private String nome;
	private Double salarioBruto;
	private Double imposto;
	

	public Double SalarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void IncrementoSalario(Double porcentagem) {
		this.salarioBruto = salarioBruto + (salarioBruto * (porcentagem/100));
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	@Override
    public String toString() {
        return nome + ", " + "$ " + SalarioLiquido();
    }
	public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        Empregado emp = new Empregado();

        System.out.print("Nome: ");
        emp.nome = sc.nextLine();
        System.out.print("Salario Bruto: ");
        emp.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        emp.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Empregado: " + emp);
        System.out.println();
        System.out.print("Qual a porcentagem para aumentar o salario? ");
        double porcentagem = sc.nextDouble();
        emp.IncrementoSalario(porcentagem);

        System.out.println();
        System.out.println("Dados Atualizados: " + emp);
        sc.close();
 }
	

}
