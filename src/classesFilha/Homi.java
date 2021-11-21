package classesFilha;

import classeMae.Pessoa;
public class Homi extends Pessoa{//Quando eu escrevo extends ele já vai escrever automaticamente todos os metodos
	//E atributos da classe que eu estender, no caso Pessoa
	
	private int tamanhoDoPau;
	private double salario;
	
	@Override
	public String toString() {//Puxando o toString do classe mae
		return super.toString() + ".Homi [tamanhoDoPau: " + tamanhoDoPau + ", salario: " + salario + "]";
	}

	public int getTamanhoDoPau() {
		return tamanhoDoPau;
	}

	public void setTamanhoDoPau(int tamanhoDoPau) {
		this.tamanhoDoPau = tamanhoDoPau;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override //Sobrescrita do metodo abstrato de Pessoa, a gente é obrigado a sobrescreve-lo.
	public void calcularSalario() {
		this.salario = this.salario*1.10; //10%
	}
}