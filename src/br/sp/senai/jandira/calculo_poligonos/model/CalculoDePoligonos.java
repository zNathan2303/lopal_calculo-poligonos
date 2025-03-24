package br.sp.senai.jandira.calculo_poligonos.model;

import java.util.Scanner;

public class CalculoDePoligonos {
	
	public static void calcularRetangulo() {
		
//		teste1
		
		Retangulo retangulo = new Retangulo();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Altura do retângulo: ");
		double altura = leitor.nextDouble();
		
		System.out.println("Base do retângulo: ");
		double base = leitor.nextDouble();
		
		retangulo.setAltura(altura);
		retangulo.setBase(base);
		retangulo.exibirDados();
		
		leitor.close();
	}

}
