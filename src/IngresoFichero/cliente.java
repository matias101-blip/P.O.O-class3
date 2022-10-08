package IngresoFichero;
import java.io.Serializable;

public class cliente implements Serializable {
	
	private static final long serialVersionUID = -1L;
	
	private String DNI;
	private String Nombre;
	private String telefono;
	
	public cliente(String Dni, String Nombre, String telefono) {
		this.DNI = DNI;
		this.Nombre = Nombre;
		this.telefono = telefono;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String gettelefono() {
		return telefono;
	}
	
	public void settelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "DNI= " + DNI + " ,Nombre= " + Nombre + " ,Telefono= " + telefono;
	}
}
