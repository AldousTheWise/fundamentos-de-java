package modulo406_Rebound;

public class Persona {
private String nombre, password;
 
 public Persona(String nombre, String password) {
	 this.nombre = nombre;
	 this.password = password;
	 
 }

/* Getters */
public String getNombre() { return nombre; }
public String getPassword() { return password; }

/*Setters*/
public void setNombre(String nombre) { this.nombre = nombre; }
public void setPassword(String password) { this.password = password; }
		
 @Override
 public String toString() {
	return getNombre();
}

}
