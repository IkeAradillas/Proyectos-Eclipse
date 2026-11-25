package Pregunta5;

public class Equilater extends Triangle {

	public Equilater(double c1, double c2, double c3) throws NoEquilaterTriangleException {
		if(c1!=c2 || c2!=c3) throw new NoEquilaterTriangleException("Aquest triangle no te les mesures correctes per ser un equilater");
		super(c1, c2, c3);
	}

	
}
