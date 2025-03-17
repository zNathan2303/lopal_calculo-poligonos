package br.sp.senai.jandira.calculo_poligonos.model;

public class Triangulo {
	
	private double altura;
	private double base;
	private double ladoEsquerdo;
	private double ladoDireito;
	
	public void setLadoEsquerdo(double ladoEsquerdo) {
		this.ladoEsquerdo = ladoEsquerdo;
	}
	
	public double getLadoEsquerdo() {
		return ladoEsquerdo;
	}
	
	public void setLadoDireito(double ladoDireito) {
		this.ladoDireito = ladoDireito;
	}
	
	public double getLadoDireito() {
		return ladoDireito;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
//	if(setLadoEsquerdo == setLadoDireito + setBase && setLadoDireito == setLadoEsquerdo + setBase && setBase == setLadoEsquerdo + setLadoDireito) {
//		
//	}
	
	public double calcularArea() {
		double area = (base * altura)/2;
		return area;
	}
	
	public void exibirDados() {
		System.out.println("A área do triângulo é: " + calcularArea());
		System.out.println();
	}
}
