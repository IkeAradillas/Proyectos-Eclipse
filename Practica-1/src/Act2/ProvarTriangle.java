package Act2;

import java.util.ArrayList;

public class ProvarTriangle {
	public static void main(String[] args) {
		ArrayList<Triangle> t = new ArrayList<>();
		
		try {
			Escaleno es1 = new Escaleno(1,2,3);
			t.add(es1);
			System.out.println("Se ha creado el escaleno 1");
			Escaleno es2 = new Escaleno(2,2,1);
			t.add(es2);
			System.out.println("Se ha creado el escaleno 1");
		} catch (NoEscalenoTriangleException e) {
			e.printStackTrace();
		}
		
		try {
			Isosceles i1 = new Isosceles(2,2,1);
			t.add(i1);
			System.out.println("Se ha creado el isosceles 1");
			Isosceles i2 = new Isosceles(2,2,2);
			t.add(i2);
			System.out.println("Se ha creado el isosceles 2");
		} catch(NoIsoscelesTriangleException e) {
			e.printStackTrace();
		}
		
		try {
			Equilater eq1 = new Equilater(1,1,1);
			t.add(eq1);
			System.out.println("Se ha creado el equilatero 1");
			Equilater eq2 = new Equilater(1,1,2);
			t.add(eq2);
			System.out.println("Se ha creado el equilatero 2");
		} catch(NoEquilaterTriangleException e) {
			e.printStackTrace();
		}
	
		for(int i = 0; i<t.size(); i++) {
			System.out.println(t.get(i).getClass() + " " + t.get(i).calcularPerimetre());
		}
	}

}
