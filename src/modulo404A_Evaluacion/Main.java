package modulo404A_Evaluacion;

import java.util.Scanner;

public class Main {
public static Auto crearAuto( Scanner sc ) {
		
		System.out.println("Ingrese los datos del vehículo: ");
		System.out.println("Marca: ");
		String marca = sc.nextLine();
		System.out.println("Modelo: ");
		String modelo = sc.nextLine();
		System.out.println("Color: ");
		String color = sc.nextLine();
		System.out.println("Velocidad máxima: ");
		int velocidadMaxima = sc.nextInt();
		sc.nextLine();
			
		return new Auto ( marca, modelo, color, velocidadMaxima );
	}
    
	public static void subirAlAuto(Auto miAuto, Scanner sc) {
		int comando;
		System.out.println("Bienvenido abordo :) ");
		System.out.println();
		
		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("1. Encender.");
			System.out.println("2. Apagar.");
			System.out.println("3. Acelerar.");
			System.out.println("0. Salir");
			comando = sc.nextInt();
			
			switch (comando) {
			case 1:
				miAuto.encender();
				System.out.println();
				break;
            case 2:
				miAuto.apagar();
				System.out.println();
				break;
            case 3:
            	miAuto.acelerar();
            	System.out.println();
            	break;
            case 0:
            	if(miAuto.isEncendido()) {
            		System.out.println("Advertencia: No se puede bajar de un vehículo en movimiento.");
            	} else {
            		System.out.println("Salir del auto. Hasta luego!");
            	}
            	System.out.println();
            	break;
		   default:
			    System.out.println("Ingrese una opción válida.");
				break;
			}
			
			
		} while ( comando != 0 || miAuto.isEncendido() );
		
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			Auto miAuto = crearAuto(sc);
			System.out.println();
			System.out.println("Felidades por su nuevo \n" + miAuto.toString());
			subirAlAuto(miAuto, sc);
			
			
			sc.close();

	}

}
