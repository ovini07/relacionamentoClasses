package RelacaoClasses;

public class Main {

	public static void main(String[] args) {
		Universidade universidade = new Universidade("USP");
		
		Estudante estudante = new Estudante("Vinicíus", universidade);
		
		System.out.println("Estudante: " + estudante.getNome() + "\nUniversidade: " + universidade.getNome());
	}

}
