package RelacaoClasses.AtividadeFormativa;

public class Autor {
	private String nome;

	public Autor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Autor: " + nome;
	}
}
