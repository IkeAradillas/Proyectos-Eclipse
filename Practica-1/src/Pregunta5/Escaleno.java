package Pregunta5;

public class Escaleno extends Triangle {

	public Escaleno(double c1, double c2, double c3) throws NoEscalenoTriangleException {
		if(c1==c2 || c2==c3 || c1==c3 ) throw new NoEscalenoTriangleException("Aquest triangle no te les mesures correctes per ser un escaleno");
		super(c1, c2, c3);
		// TODO Auto-generated constructor stub
	}

}
