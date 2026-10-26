package bytes.entrada.filtrada.seq;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FicheroLectura {

	private DataInputStream ent;

    private boolean fin;

    public FicheroLectura(String nombre) {
        fin = false;
        try {
            ent = new DataInputStream(new FileInputStream(nombre));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void lectura() throws FileNotFoundException, IOException {
    	do{
	    	try{
				System.out.println("ISBN: " + ent.readUTF());
				System.out.println("Titulo: " + ent.readUTF());
				System.out.println("Autor: " + ent.readUTF());
				System.out.println("Año: " + ent.readInt());
			} catch(EOFException e) {
				break;
			}
    	} while(true); 

    }
    

    public boolean isEof() {
        return fin;
    }

    

    public void cerrar() {
        try {
            ent.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}