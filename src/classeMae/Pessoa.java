package classeMae;

public abstract class Pessoa {//Abstract significa que a classe Pessoa n�o pode ser instanciada
	
	//protected significa que � um private, mas as classes filhas tem acesso
	protected String nome;
	protected int idade;
	
	@Override
	public String toString() {
		return "Pessoa [nome: " + nome + ", idade: " + idade + "]";
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public abstract void calcularSalario(); //M�todo abstrato n�o precisa ter corpo
}