package bytes.entrada.filtrada;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class lecturaSinBuffer {
	public static void main(String[] args) throws IOException {
		System.out.println("Procesando fichero grande Sin Buffer...");
		
		try(InputStream is = new FileInputStream("a.html")){
			int c;
		
			long crono = System.currentTimeMillis();
			while ((c = is.read()) != -1) {
				System.out.print((char) c);
			}
			
			long cronoFin = System.currentTimeMillis();
			
			long tiempoLectura = cronoFin - crono;
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SS");
		    dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		    
		    System.out.println("Sin buffer: " + dateFormat.format(new Date(tiempoLectura)));
		}
		
	}
}
