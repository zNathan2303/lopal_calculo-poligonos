package br.sp.senai.jandira.calculo_poligonos;

import java.util.Scanner;

import br.sp.senai.jandira.calculo_poligonos.ui.Menu;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("+------------------------------+");
		System.out.println(" Tabuada do 9");
		System.out.println("+------------------------------+");
		System.out.println();
		int contador = 0;
		while(contador <= 10) {
			int calculo = 9 * contador;
			System.out.println(" " + 9 + " x " + contador + " = " + calculo);
			contador = contador + 1;
		}
		
		System.out.println();
		System.out.println("+------------------------------+");
		System.out.println("Números ímpares de 0 à 100");
		System.out.println("+------------------------------+");
		System.out.println();
		contador = 0;
		while(contador <= 100) {
			if (contador % 2 == 1) {
				System.out.println(" O número " + contador + " é primo!");
			}
			contador = contador + 1;
		}
		
		System.out.println();
		System.out.println("+------------------------------+");
		Scanner leitor = new Scanner(System.in);
		String resposta = "s";
		while (resposta.equalsIgnoreCase("s")) {
			System.out.println("Estamos dando voltas!");
			System.out.print("Mais uma volta (S/N)? ");
			resposta = leitor.next();
			
			
			
		}
		
		leitor.close();
		
//		contador += 2;
//		Menu.criarMenu();
		
	}
	
}
