import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	static final String SRC1 = "Cosas a hacer practica.pdf",
						TARGET = "security.pdf";
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream(SRC1);
			FileOutputStream fos = new FileOutputStream(TARGET);
			{
				int car;
				while((car= fis.read()) != -1) {
					fos.write(car);
				}
				System.out.println("Progreso completado");
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
