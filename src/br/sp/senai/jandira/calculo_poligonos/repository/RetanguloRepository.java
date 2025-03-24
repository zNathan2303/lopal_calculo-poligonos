package br.sp.senai.jandira.calculo_poligonos.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calculo_poligonos.model.Retangulo;

public class RetanguloRepository {
	
	public void criarRetangulo() {
		Scanner leitor = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println();
		System.out.println("Criando um retângulo...");
		
		System.out.print("Qual a medida da altura do retângulo? ");
		retangulo.setAltura(leitor.nextDouble());
		
		System.out.print("Qual a medida da base do retângulo? ");
		retangulo.setBase(leitor.nextDouble());
		
		retangulo.exibirDados();
		
		leitor.close();
		
	}

}
