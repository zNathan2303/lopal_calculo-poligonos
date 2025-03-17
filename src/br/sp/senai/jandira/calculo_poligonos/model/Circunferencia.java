package br.sp.senai.jandira.calculo_poligonos.model;

public class Circunferencia {
	
	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio(){
		return raio;
	}
	
	public double calcularArea() {
		double area = Math.PI * (raio * raio);
		return area;
	}
	
	public void exibirDados() {
		System.out.println("A área da circunferência é: " + calcularArea());
		System.out.println();
	}
}
