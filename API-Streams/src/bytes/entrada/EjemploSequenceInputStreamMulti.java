package bytes.entrada;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EjemploSequenceInputStreamMulti {
	
	static final String SRC1 = "origen1.txt",
						SRC2 = "origen2.txt",
						SRC3 = "origen3.txt",
						TARGET = "fusion.txt";
	
	public static void main(String[] args) throws FileNotFoundException {
		
		List<FileInputStream> fuentes = 
				List.of(new FileInputStream(SRC1), 
						new FileInputStream(SRC2),
						new FileInputStream(SRC3));
		
		Enumeration<? extends InputStream> miEnumeracion = 
				Collections.enumeration(fuentes);
		try(SequenceInputStream sis = new SequenceInputStream(miEnumeracion);
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
