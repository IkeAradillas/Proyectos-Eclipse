package bytes.entrada.filtrada;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class GeneradorEncuesta {
	public static void main(String[] args) {
		System.out.println("Bienvenido a la encuesta");
		try(Scanner sc = new Scanner(System.in); DataOutputStream dos = new DataOutputStream(new FileOutputStream("salida.bin", true))){
			System.out.println("Nombre: ");
			String nom = sc.nextLine();
			dos.writeUTF(nom);
			
			System.out.println("Edad: ");
			int edad = sc.nextInt();
			dos.writeInt(edad);
			
			System.out.println("Sueldo: ");
			float sueldo = sc.nextFloat();
			dos.writeFloat(sueldo);
			
			System.out.println("Soltero (s/n): ");
			boolean soltero = sc.next() == "s" ? true : false;
			dos.writeBoolean(soltero);
			
			System.out.println("Gracias por contestar la encuesta " + nom);
		}
		catch(IOException f) {
			System.out.println("Error: " + f.getMessage());
		}
		
		

	}

}
