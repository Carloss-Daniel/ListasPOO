package exercicio6;

public class Main {

	public static void main(String[] args) {
		PessoaIndividual Pi1 = new PessoaIndividual("12834462437");
		PessoaLegal Pl1 = new PessoaLegal("11472307000101");
		PessoaIndividual Pi2 = new PessoaIndividual("12834462438");
		PessoaLegal Pl2 = new PessoaLegal("12472307000101");
	    System.out.println(Pi1.isValid());
	    System.out.println(Pl1.isValid());
	    System.out.println(Pi2.isValid());
	    System.out.println(Pl2.isValid());
	
	}

}

