package IngresoFichero;


public class DniException extends Exception {
	
	public static final String Longitud_no_correcta = "La longitud debe estar entre 8 y";
	public static final String Parte_Numerica_no_correcta = "La parte numerica del Dni";
	public static final String Formato_no_correcto = "La parte de la letra del Dni";
	
	public DniException(String mensaje) {
		
	}
	
}
