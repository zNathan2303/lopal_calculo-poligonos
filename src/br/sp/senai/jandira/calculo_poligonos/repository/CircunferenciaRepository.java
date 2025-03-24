package br.sp.senai.jandira.calculo_poligonos.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calculo_poligonos.model.Circunferencia;

public class CircunferenciaRepository {

	public void criarCircunferencia() {
		Scanner leitor = new Scanner(System.in);
		Circunferencia circunferencia = new Circunferencia();
		
		System.out.println();
		System.out.println("Criando uma circunferência...");
		
		System.out.print("Qual a medida do raio da circunferência? ");
		circunferencia.setRaio(leitor.nextDouble());
		
		circunferencia.exibirDados();
		
		leitor.close();
		
	}
	
}
