package br.sp.senai.jandira.calculo_poligonos;

import br.sp.senai.jandira.calculo_poligonos.model.*;

public class Main {

	public static void main(String[] args) {
		Circunferencia circunferencia = new Circunferencia();
		circunferencia.setRaio(9);
		circunferencia.exibirDados();
		
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(4);
		quadrado.exibirDados();
		
		Retangulo retangulo = new Retangulo();
		retangulo.setAltura(5);
		retangulo.setBase(8);
		retangulo.exibirDados();
		
		Trapezio trapezio = new Trapezio();
		trapezio.setAltura(9);
		trapezio.setBaseMenor(10);
		trapezio.setBaseMaior(18);
		trapezio.exibirDados();
		
		Triangulo triangulo = new Triangulo();
		triangulo.setAltura(9);
		triangulo.setBase(9);
		triangulo.exibirDados();
	}
	
}
