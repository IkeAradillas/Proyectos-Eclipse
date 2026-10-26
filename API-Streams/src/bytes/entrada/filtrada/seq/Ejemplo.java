package bytes.entrada.filtrada.seq;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejemplo {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        Registro registro;
        
        FicheroEscritura fichero = new FicheroEscritura("libros.dat");
        FicheroLectura fl = new FicheroLectura("libros.dat");
        
        registro = new Registro("1132-AAA", "el titulo", "el autor", 1997);
        fichero.insertar(registro);
        
        registro = new Registro("77179-BBB", "el otro titulo", "el otro autor", 2002);
        fichero.insertar(registro);
        
        registro = new Registro("0030-SSS", "el nuevo titulo", "el viejo autor", 1970);
        fichero.insertar(registro);
        
        registro = new Registro("1240-CCC", "IkerAraGom", "Iker Aradillas Gómez", 2020);
        fichero.insertar(registro);
        
        fichero.cerrar();
        
        // fin de la edicion. Pasamos a la lectura
        
        fl.lectura();
        fl.cerrar();
        
        System.out.println("****************");
        System.out.println("Fin del programa");
        
    }

}