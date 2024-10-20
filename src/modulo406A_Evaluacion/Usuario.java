package modulo406A_Evaluacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Usuario {
	private String nombreUsuario, password, nombrePersona,  fechaNacimiento;

	public Usuario(String nombreUsuario, String password, String nombrePersona,  String fechaNacimiento) {
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.nombrePersona = nombrePersona;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombreUsuario() { return nombreUsuario; }
	public String getPassword() { return password; }
	public String getNombrePersona() { return nombrePersona; }
	public String getFechaNacimiento() { return fechaNacimiento; }

	public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }
	public void setPassword(String password) { this.password = password; }
	public void setNombrePersona(String nombrePersona) { this.nombrePersona = nombrePersona; }
	public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; } 
	
	
	public static boolean validarPassword(String password) {
        boolean tieneMayuscula = false;
        int contadorNumeros = 0;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }

            if (Character.isDigit(c)) {
                contadorNumeros++;
            }
        }

        return tieneMayuscula && contadorNumeros >= 3;
    }
    
	
	 public boolean esMayorDeEdad() {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        LocalDate fechaNac = LocalDate.parse(this.fechaNacimiento, formatter);

	        
	        LocalDate fechaActual = LocalDate.now();

	        long edad = ChronoUnit.YEARS.between(fechaNac, fechaActual);
	        return edad >= 18;
	    }

	@Override
	
	public String toString() {
		return "Usuario: " + nombreUsuario + ", Nombre: " + nombrePersona + ", Fecha de nacimiento: " + fechaNacimiento;
	}






  
	
}
