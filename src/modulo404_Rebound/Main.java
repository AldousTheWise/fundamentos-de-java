package modulo404_Rebound;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
 /* Obtener datos: */
	public static void pedirDatosPersonas(Scanner sc, ArrayList<Persona> listaPersonas, int cantidad) {
		
		for (int i = 0; i <  cantidad; i++) {
			System.out.println("ingrese datos. Persona: " + (i +1) +" de " + cantidad);
			
			System.out.println("Nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Edad: ");
			int edad = sc.nextInt();
			sc.nextLine();
			System.out.println("Peso: ");
			int peso = sc.nextInt();
			sc.nextLine();
			System.out.println("Altura (en metros): ");
			String alturaString = sc.next().replace(",", ".");
			float altura  = Float.parseFloat(alturaString);
			
			sc.nextLine();
			
			Persona persona = new Persona(nombre, edad, peso, altura);
			listaPersonas.add(persona);
		
		}
	}
    
	/* Calculo IMC */
	public static void calcularIMC(int peso, float altura) {
		float IMC = peso/(altura*altura);
		System.out.printf("Su índice de masa corporal es: %.1f.%n", IMC);
		
		if (IMC < 18.5) {
			System.out.println("Usted se encuentra bajo de peso.");
		} else if (IMC >= 18.6 && IMC <= 24.9) {
			System.out.println("Usted tiene un rango normal de peso.");
		} else if (IMC >= 25 && IMC <= 29.9) {
			System.out.println("Usted tiene sobrepeso.");
		} else {
			System.out.println("Usted tiene obesidad.");
		}
		
	}
	
	/* Determinar mayoria de edad*/
	
	public static void determinarMayoriaEdad(int edad) {
		System.out.println("Su edad es :" + edad + ".");
		
		if (edad >=18) {
			System.out.println("Usted es mayor de edad.");
		} else {
			System.out.println("Usted es menor de edad.");
		}
		System.out.println();
	}
	
	/* Imprimir tarjeta de datos */

	public static void imprimirPersona(ArrayList<Persona> listaPersonas) {
		for (Persona persona : listaPersonas) {
			System.out.println(persona.getNombre() + " :");
			System.out.println();
			System.out.println("Calculando su IMC... ");
			System.out.println();
			calcularIMC(persona.getPeso(), persona.getAltura());
			System.out.println();
			determinarMayoriaEdad(persona.getEdad());
			System.out.println(persona.toString());
		}		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    ArrayList<Persona> listaPersonas = new ArrayList<>();
	    
	    System.out.println("Nro. de personas: ");
	    int cantidad = sc.nextInt();
	    sc.nextLine();
	    
	    pedirDatosPersonas(sc, listaPersonas, cantidad);
	    System.out.println();
	     
	    imprimirPersona(listaPersonas);

        sc.close();
	}
}
