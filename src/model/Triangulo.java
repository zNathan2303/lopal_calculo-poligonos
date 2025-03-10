package model;

public class Triangulo {
	
	private double altura;
	private double base;
	
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
	
	public double calcularArea() {
		double area = (base * altura)/2;
		return area;
	}
	
	public void exibirDados() {
		System.out.println("A área do triângulo é: " + calcularArea());
		System.out.println();
	}
}
