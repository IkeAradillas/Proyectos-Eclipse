package bytes.entrada;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class EjemploSequenceInputStream {
	
	static final String SRC1 = "origen1.txt",
						SRC2 = "origen2.txt",
						TARGET = "fusion.txt";
	
	public static void main(String[] args) {
		try(SequenceInputStream sis = new SequenceInputStream(
				new FileInputStream(SRC1), new FileInputStream(SRC2));
				FileOutputStream fos = new FileOutputStream(TARGET))
		{
			int car;
			while((car= sis.read()) != -1) {
				fos.write(car);
			}
			System.out.println("Progreso completado");
		} catch(IOException e) {
			e.getMessage();
		}
	}

}
