package modulo406A_Evaluacion;

import java.util.Scanner;

public class Main {

	public static void crearUsuario(Scanner sc, Usuario[] usuarios, int index) {
		System.out.println("--------------------------------");
		System.out.println("Ingrese nuevo nombre de usuario:");
		String nombreUsuario = sc.nextLine();
		
		String password;
		
		do {
			System.out.println("Ingrese contraseña:");
			 password = sc.nextLine();
			
			System.out.println("----------------------");
			
			 if(!Usuario.validarPassword(password)) {
				System.out.println("Contraseña débil. La contraseña debe tener al menos una mayúscula y tres números.");
			}
		} while (!Usuario.validarPassword(password));
		
		System.out.println("Ingrese nombre completo: ");
		String nombrePersona = sc.nextLine();
		System.out.println("Ingrese fecha de nacimiento DD-MM-AAAA");
		String fechaNacimiento = sc.nextLine();
	
		
		usuarios[index] = new Usuario(nombreUsuario, password, nombrePersona, fechaNacimiento);
		
		System.out.println("Bienvenido/a " + usuarios[index].getNombreUsuario());
		if (usuarios[index].esMayorDeEdad()) {
			System.out.println("Puede pasar a la zona para mayores de 18 años.");
		}
	}
	
	@SuppressWarnings("unused")
	public static void agregarUsuario(Scanner sc, Usuario[] usuarios) {
		for (int i = 0; i < usuarios.length; i++) {
			if(usuarios[i] == null){
				System.out.println("Quieres registrarte? (si/no)");
			    String respuesta = sc.nextLine().toLowerCase().trim();
			    
			    if(respuesta.equals("si")) {
			    	crearUsuario(sc, usuarios, i);
			    	break;
			    } else {
			    	System.out.println("No se agregó ningún usuario");
			    	break;
			    }
			}
		}		
		
		if(usuarios[usuarios.length - 1] != null) {
			System.out.println("No se pueden agregar más usuarios. Se ha alcanzado el límite de capacidad");
		}
	}
	
	public static void imprimirUsuario(Usuario[] usuarios) {
		System.out.println("Personas ingresadas :");
		int contador = 1;
		
		for (Usuario usuario : usuarios) {
			
			if(usuario != null) {
				System.out.println(contador + ". " + usuario.getNombreUsuario());
				contador++;
			}
			
		}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Usuario[] usuarios = new Usuario[10];
		
		
		agregarUsuario(sc, usuarios);
		
		imprimirUsuario(usuarios);
		
				
       sc.close();
	}

}
