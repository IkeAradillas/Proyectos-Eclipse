package Pregunta6;

public class Isosceles extends Triangle {

	public Isosceles(double c1, double c2, double c3) throws NoIsoscelesTriangleException {
		if(c1==c2 && c2==c3) throw new NoIsoscelesTriangleException("Aquest triangle no te les mesures correctes per ser un isosceles");
		super(c1, c2, c3);
	}

}
