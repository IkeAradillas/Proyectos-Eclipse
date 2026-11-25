package Pregunta5;

public class Triangle {
	private double costat1;
	private double costat2;
	private double costat3;

	public Triangle(double c1, double c2, double c3) {
		costat1 = c1;
		costat2 = c2;
		costat3 = c3;
	}

	public double getCostat1() {
		return costat1;
	}

	public void setCostat1(double costat1) {
		this.costat1 = costat1;
	}

	public double getCostat2() {
		return costat2;
	}

	public void setCostat2(double costat2) {
		this.costat2 = costat2;
	}

	public double getCostat3() {
		return costat3;
	}

	public void setCostat3(double costat3) {
		this.costat3 = costat3;
	}
	
	public double calcularPerimetre() {
		return costat1 + costat2 + costat3;
	}
	

}

