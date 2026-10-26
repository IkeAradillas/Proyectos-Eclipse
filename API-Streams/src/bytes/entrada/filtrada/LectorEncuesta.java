package bytes.entrada.filtrada;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LectorEncuesta {
	private static final String FILE_NAME = "salida.bin";
	
	public static void main(String[] args) {
		try(DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))){
			System.out.println("Nombre: " + dis.readUTF());
			System.out.println("Edad: " + dis.readInt());
			System.out.println("Sueldo: " + dis.readFloat());
			System.out.println("Soltero: " + (dis.readBoolean() ? "Si" : "No"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
