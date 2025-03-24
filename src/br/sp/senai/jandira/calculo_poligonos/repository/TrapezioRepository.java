package br.sp.senai.jandira.calculo_poligonos.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calculo_poligonos.model.Trapezio;

public class TrapezioRepository {
	
	public void criarTrapezio() {
		Scanner leitor = new Scanner(System.in);
		Trapezio trapezio = new Trapezio();
		
		System.out.println();
		System.out.println("Criando um trapézio...");
		
		System.out.print("Qual a medida da altura do trapézio? ");
		trapezio.setAltura(leitor.nextDouble());
		
		System.out.print("Qual a medida da base menor do trapézio? ");
		trapezio.setBaseMenor(leitor.nextDouble());
		
		System.out.print("Qual a medida da base maior do trapézio? ");
		trapezio.setBaseMaior(leitor.nextDouble());
		
		trapezio.exibirDados();
		
		leitor.close();
		
	}

}
