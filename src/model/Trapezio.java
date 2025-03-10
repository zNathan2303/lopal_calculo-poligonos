package model;

public class Trapezio {

	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public double getBaseMaior() {
		return baseMaior;
	}
	
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public double getBaseMenor() {
		return baseMenor;
	}
	
	public double calcularArea() {
		double area = ((baseMaior + baseMenor)*altura)/2;
		return area;
	}
	
	public void exibirDados() {
		System.out.println("A área do trapézio é: " + calcularArea());
		System.out.println();
	}
}
