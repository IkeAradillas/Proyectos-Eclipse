package app;

import java.io.File;
import java.io.FileInputStream;


public class Lector {

	static final String MP3 = "cancion-ejemplo.mp3"; 
	
	public static void main(String[] args) {
		File mp3 = new File(MP3);
		
		if(mp3.exists()) {
			System.out.println("Se encontro el MP3");
			System.out.println("Longitud: " + mp3.length());
			
			try {
				FileInputStream fis = new FileInputStream(MP3);
				fis.skip(mp3.length()-128);
				
				byte[] infoID3 = new byte[128];
				
				fis.read(infoID3);
				
				String ID3 = new String(infoID3);
				
				System.out.println(ID3.substring(0,3));
				System.out.println(ID3.substring(3,32));
				System.out.println(ID3.substring(32, 62));
				System.out.println(ID3.substring(63,91));
				System.out.println(ID3.substring(93,97));
				
			
				
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		else System.out.println("No se encontro el MP3");
		
	}

}
