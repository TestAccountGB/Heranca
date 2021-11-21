package classesFilha;

import classeMae.Pessoa;
public class Muie extends Pessoa{//Quando eu escrevo extends ele já vai escrever automaticamente todos os metodos
	//E atributos da classe que eu estender, no caso Pessoa
	
	private int larguraKKK;
	private double salario;
	
	@Override
	public String toString() {
		return super.toString() + ".Muie [larguraKKK: " + larguraKKK + ", salario: " + salario + "]";
	}

	public int getLarguraKKK() {
		return larguraKKK;
	}
	
	public void setLarguraKKK(int larguraKKK) {
		this.larguraKKK = larguraKKK;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void calcularSalario() {
		this.salario = this.salario*0.90;//-10%
	}
}