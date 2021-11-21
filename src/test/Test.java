package test;

import classesFilha.*;
import java.util.Scanner;
import classeMae.Pessoa;

@SuppressWarnings("unused")
public class Test {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Pessoa p =  new Pessoa(); //Não tem como instanciar uma classe abstrata
		Homi h = new Homi();
		Muie m = new Muie();
		
		//Homi
		
		System.out.println("Nome Homi: ");
		h.setNome(scan.next());
		
		System.out.println("Idade Homi: ");
		h.setIdade(scan.nextInt());
		
		 //Atributos distintos
		
		System.out.println("Tamanho Homi: ");
		h.setTamanhoDoPau(scan.nextInt());
		
		System.out.println("Salario Homi: ");
		h.setSalario(scan.nextDouble());
		
////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Muie
		
		System.out.println("Nome Muie: ");
		m.setNome(scan.next());
		
		System.out.println("Idade Muie: ");
		m.setIdade(scan.nextInt());
		
		 //Atributos distintos
		
		System.out.println("Largura Muie: ");
		m.setLarguraKKK(scan.nextInt());
		
		System.out.println("Salario Muie: ");
		m.setSalario(scan.nextDouble());
		
////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Metodos Sobrescritos
		
		h.calcularSalario();
		m.calcularSalario();

////////////////////////////////////////////////////////////////////////////////////////////////
		
		//toString Metodo Sobrescrito

		System.out.println(h);
		System.out.println(m);
	}
}