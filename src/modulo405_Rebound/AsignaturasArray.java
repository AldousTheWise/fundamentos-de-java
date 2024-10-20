package modulo405_Rebound;


import java.util.Scanner;

public class AsignaturasArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] asignaturas = new String[5];
		float[] promedios = new float[5];
		float promedioGeneral = 0;
		float promedioSuma = 0;
		
	    for (int i = 0; i < asignaturas.length; i++) {
	    	
	    	System.out.println("Ingrese asignatura (" + (i + 1) + "/5) :");
	    	asignaturas[i] = sc.nextLine();	
	        
	    	System.out.println("Ingrese el promedio de: " + asignaturas[i]);
	    	String promediosString = sc.nextLine().replace(",", ".");
	    	promedios[i] = Float.parseFloat(promediosString);
		}
	    
		System.out.println();
		System.out.println("Sus notas son las siguientes: ");
		int index = 0;
		
		for (String asignatura : asignaturas) {
			System.out.println(asignatura +" = " + promedios[index]);
			promedioSuma += promedios[index];
			index++;
		}
		 
		promedioGeneral = (promedioSuma / promedios.length);
		System.out.printf("Su promedio general es: %.1f%n", promedioGeneral);
		
		sc.close();
	}

}
