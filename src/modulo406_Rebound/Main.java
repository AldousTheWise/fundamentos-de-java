package modulo406_Rebound;

import java.util.ArrayList;
import java.util.Scanner;


 class Main {
	 
	public static Persona loginUsuario(Scanner sc, ArrayList<Persona> usuarioRegistrado) {
		String usuarioIngresado, passwordIngresado;
		
		System.out.println("Bienvenido: ");
		System.out.println("Ingrese su usuario:");
		usuarioIngresado = sc.nextLine().toLowerCase().trim();
		System.out.println("Ingrese contraseña: ");
		passwordIngresado = sc.nextLine().trim();
		
		for (Persona usuario : usuarioRegistrado) {
			if (usuario.getNombre().toLowerCase().equals(usuarioIngresado) && usuario.getPassword().equals(passwordIngresado)) {
				return usuario;
			} 
		}
		
		return null;
	}
	
	public static void calcularRaiz(Scanner sc) {
		double numeroUsuario, numeroRaiz = 0;
		
		System.out.println("Ingrese número:");
		numeroUsuario = sc.nextDouble();
		sc.nextLine();
		
		if(numeroUsuario <= 0) {
			System.out.println("Ingrese un número válido sobre 0.");
			} else {
				numeroRaiz = Math.sqrt(numeroUsuario);
				System.out.println(Math.floor(numeroRaiz));
			}
		}
	
	public static void imprimirPI() {
		System.out.printf("Valor de PI con 4 decimales: %.4f\n", Math.PI);
	}
	
	public static void calcularPotencia(Scanner sc) {
		System.out.println("Ingrese número base:");
		double numeroBase = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese número exponente:");
		double numeroExponente = sc.nextInt();
		sc.nextLine();
		
		double resultado = Math.pow(numeroBase, numeroExponente);
		System.out.println("El número " + numeroBase + " elevado a " + numeroExponente + " es igual a " + resultado );	
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Persona> usuarioRegistrado = new ArrayList<>();
		
		
		
		Persona usuario1 = new Persona("admin", "admin123");
		Persona usuario2 = new Persona("EOrtiz", "Eort2024");
		Persona usuario3 = new Persona("TBravo", "bravocl1990");
		Persona usuario4 = new Persona("LoreM", "2000Lmoreno");
		
	   		
	   usuarioRegistrado.add(usuario1);
	   usuarioRegistrado.add(usuario2);
	   usuarioRegistrado.add(usuario3);
	   usuarioRegistrado.add(usuario4);
	   
	   Persona usuarioAutenticado = loginUsuario(sc, usuarioRegistrado);
	   
	   if (usuarioAutenticado != null) {
		boolean salir = false;
		int opcion;
		
		System.out.println("Hola, " + usuarioAutenticado.getNombre());
		
		
		do {
			System.out.println("¿Qué quieres hacer hoy?");
			System.out.println("1. Calcular la raíz cuadrada de un número.");
			System.out.println("2. Ver el valor de \u03C0 .");
			System.out.println("3. Calcular la potencia de un número.");
			System.out.println("4. Salir.");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			case 1:
				calcularRaiz(sc);
				break;
			case 2:
				imprimirPI();
				break;
			case 3:
				calcularPotencia(sc);
				break;
			case 4:
				System.out.println("Vuelve pronto!");
				System.out.println();
				salir = true;
				break;
			default:
				System.out.println("Ingrese una opción válida.");
				break;
			}
		} while (!salir);
		
	   } else {
        System.out.println("Ingrese un usuario válido");
        System.out.println();
        loginUsuario(sc, usuarioRegistrado);
	   }
	   
		sc.close();
	}

}
