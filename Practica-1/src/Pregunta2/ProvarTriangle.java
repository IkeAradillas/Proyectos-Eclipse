package Pregunta2;

import Pregunta1.Triangle;

public class ProvarTriangle {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.setCostat1(3);
		t1.setCostat2(5);
		t1.setCostat3(3);
		
		
		t2.setCostat1(6);
		t2.setCostat2(7);
		t2.setCostat3(6);
		
		System.out.println(t1.calcularPerimetre());
		System.out.println(t2.calcularPerimetre());
	}

}
