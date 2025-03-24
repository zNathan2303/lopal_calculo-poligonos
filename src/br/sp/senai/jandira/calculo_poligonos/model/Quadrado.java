package br.sp.senai.jandira.calculo_poligonos.model;

public class Quadrado {

//	teste1
	
	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public double calcularArea() {
		double area = lado * lado;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = (lado+lado+lado+lado);
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("A área do quadrado é: " + calcularArea());
		System.out.println("O perimetro do quadrado é: " + calcularPerimetro());
		System.out.println();
	}

}
