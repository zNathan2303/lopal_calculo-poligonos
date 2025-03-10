package model;

public class Retangulo {
	
	private double base;
	private double altura;
	
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
		double area = base * altura;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = (base+base+altura+altura);
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("A área do retângulo é: " + calcularArea());
		System.out.println("O perimetro do retângulo é: " + calcularPerimetro());
		System.out.println();
	}
}