package Pregunta6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ProvarTriangle {
	public static void main(String[] args) throws NoEscalenoTriangleException, IOException, NoEquilaterTriangleException, NoIsoscelesTriangleException {
		ArrayList<Triangle> t = new ArrayList<>();
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("triangles.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(true) {
			String clase = null; 
			try {
				clase = dis.readUTF();
			} catch(EOFException e) {
				break;
			}
			if (clase.equals("Escaleno")) t.add(new Escaleno(dis.readDouble(), dis.readDouble(), dis.readDouble()));
			else if(clase.equals("Equilater")) t.add(new Equilater(dis.readDouble(), dis.readDouble(), dis.readDouble()));
			else if(clase.equals("Isosceles")) t.add(new Isosceles(dis.readDouble(), dis.readDouble(), dis.readDouble()));
		}
		
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("triangles.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Escaleno es1 = new Escaleno(1,2,3);
			t.add(es1);
			System.out.println("Se ha creado el escaleno 1");
		} catch (NoEscalenoTriangleException e) {
			e.printStackTrace();
		}
		
		try {
			Isosceles i1 = new Isosceles(2,2,1);
			t.add(i1);
			System.out.println("Se ha creado el isosceles 1");
		} catch(NoIsoscelesTriangleException e) {
			e.printStackTrace();
		}
		
		try {
			Equilater eq1 = new Equilater(1,1,1);
			t.add(eq1);
			System.out.println("Se ha creado el equilatero 1");
		} catch(NoEquilaterTriangleException e) {
			e.printStackTrace();
		}
	
		for(int i = 0; i<t.size(); i++) {
			try {
				dos.writeUTF(t.get(i).getClass().getSimpleName());
				dos.writeDouble(t.get(i).getCostat1());
				dos.writeDouble(t.get(i).getCostat2());
				dos.writeDouble(t.get(i).getCostat3());
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(t.get(i).getClass().getSimpleName() + " " + t.get(i).calcularPerimetre());
		}
	}

}
