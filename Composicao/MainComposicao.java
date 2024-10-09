package RelacaoClasses.Composicao;

public class MainComposicao {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa ("João", 80);
			System.out.println(pessoa.getNome () + " tem a média de " + pessoa.getCoracao () +  "batimentos");
	}
}
