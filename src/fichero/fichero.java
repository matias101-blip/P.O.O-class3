package fichero;

import java.io.FileReader;
import java.io.IOException;

public class fichero{
	
	public static void main(String[] args) {
		final String nomfichero="C:\\Users\\PRO\\Desktop\\hentai\\hentai-list.txt";
		try (FileReader fr = new FileReader(nomfichero)){
			
			int valor=fr.read();
			while (valor !=1) {
				
				if (valor != 32) {
					System.out.print((char)valor);
				}
				valor = fr.read();
			}
		}catch(IOException e) {
			System.out.println("Problema con el E/S" + e);
		}
	}
}