package br.sp.senai.jandira.calculo_poligonos;

import java.util.Scanner;

import br.sp.senai.jandira.calculo_poligonos.model.*;

public class Main {

	public static void main(String[] args) {
		
		Menu.criarMenu();
		
//		Scanner leitor = new Scanner(System.in);
//		
//		System.out.print("Qual raio da circunferência? ");
//		double valorRaio = leitor.nextDouble();
//		
//		System.out.print("Qual a altura do quadrado? ");
//		double valorLado = leitor.nextDouble();
//		
//		System.out.print("Qual a altura do rentângulo? ");
//		double valorAltura = leitor.nextDouble();
//		
//		System.out.print("Qual a base do rentângulo? ");
//		double valorBaseRetangulo = leitor.nextDouble();
		
		Circunferencia circunferencia = new Circunferencia();
		circunferencia.setRaio(5);
		circunferencia.exibirDados();
		
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(5);
		quadrado.exibirDados();
		
		Retangulo retangulo = new Retangulo();
		retangulo.setAltura(5);
		retangulo.setBase(5);
		retangulo.exibirDados();
		
		Trapezio trapezio = new Trapezio();
		trapezio.setAltura(9);
		trapezio.setBaseMenor(10);
		trapezio.setBaseMaior(18);
		trapezio.exibirDados();
		
		Triangulo triangulo = new Triangulo();
		triangulo.setAltura(9);
		triangulo.setBase(5);
		triangulo.setLadoEsquerdo(4);
		triangulo.setLadoDireito(3);
		triangulo.exibirDados();
	}
	
}
