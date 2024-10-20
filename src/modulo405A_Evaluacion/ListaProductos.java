package modulo405A_Evaluacion;

import java.util.Scanner;

public class ListaProductos {
	
	public static void mostrarProducto(Producto[] listaProducto) {
		for (int i = 0; i < listaProducto.length; i++) {
			if ( listaProducto[i] != null ) {
				System.out.println(listaProducto[i].toString());
			} 
		}
	}
	
	public static void ingresarProducto(Scanner sc, Producto[] listaProducto) {
		for (int i = 0; i < listaProducto.length; i++) {
			if(listaProducto[i] == null) {
				
				String nombre = ""; 
				String descripcion = "";
				int precio = 0;
				
				listaProducto[i] = new Producto( nombre, precio, descripcion );
				
				System.out.println("Ingrese los datos del producto");
				System.out.println();
				
				System.out.println("Nombre: ");
				nombre = sc.nextLine();
				listaProducto[i].setNombre(nombre);
				
				System.out.println("Precio: ");
				precio = sc.nextInt();
				sc.nextLine();
				listaProducto[i].setPrecio(precio);
				
				System.out.println("Descripción: ");
				descripcion = sc.nextLine();
				listaProducto[i].setDescripcion(descripcion);			
				
				System.out.println(listaProducto[i].toString());
				break;
			}
		}
	}
	
	public static void modificarProducto(Scanner sc, Producto[] listaProducto) {
		System.out.println("Seleccione producto a modificar: ");
		mostrarProducto(listaProducto);
		
		String nombre = sc.nextLine();
		boolean productoEncontrado = false;
		
		for (int i = 0; i < listaProducto.length; i++) {
			 if (listaProducto[i] != null && listaProducto[i].getNombre().equals(nombre)) {
			  productoEncontrado = true;
			  boolean salir = false;
			  
			  do {
				System.out.println("Seleccione el atributo a cambiar:");
				System.out.println("1. Nombre");
				System.out.println("2. Precio");
				System.out.println("3. Descripción");
				System.out.println("4. Salir");
				
				int numeroOpcion = sc.nextInt();
				sc.nextLine();
				
				switch (numeroOpcion) {
				case 1:
					System.out.println("Ingrese un nuevo nombre");
					listaProducto[i].setNombre(sc.nextLine());
					break;
				case 2:
					System.out.println("Ingrese nuevo precio:");
					listaProducto[i].setPrecio(sc.nextInt());
					sc.nextLine();
					break;
                case 3:
	                System.out.println("Ingrese nueva descripción: ");
	                listaProducto[i].setDescripcion(sc.nextLine());
	                break;
                case 4:
	                salir = true;
	                System.out.println("Producto modificado correctamente.");
	                break;
                default:
					System.out.println("Ingrese una opcion válida.");
				}
			} while (!salir);
			  break; 
			}
			
		}
		
		if(!productoEncontrado) {
			System.out.println("Producto no encontrado");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Producto[] listaProducto = new Producto[7];
		boolean salir = false;
		
		listaProducto[0] = new Producto( "chocolate", 500, "Chocolate amargo. 500 grs" );
		listaProducto[1] = new Producto( "leche", 800, "Leche entera. 1 litro" );
		listaProducto[2] = new Producto( "arroz", 900, "Arroz grado 2. 1 kg" );
		
		do {
			int opcion;
			System.out.println("Hola. Ingresa una opción: ");
			System.out.println("1. Ver productos.");
			System.out.println("2. Agregar productos.");
			System.out.println("3. Modificar producto.");
			System.out.println("4. Salir.");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			case 1:
				mostrarProducto(listaProducto);
				System.out.println();
				break;
			case 2:
				ingresarProducto(sc, listaProducto);
				System.out.println();
				break;
			case 3:
				modificarProducto(sc, listaProducto);
				System.out.println();
				break;
			case 4:
				System.out.println("Hasta luego!");
				System.out.println();
				salir = true;
				break;

			default:
				System.out.println("Ingrese una opción válida.");
				System.out.println();
				break;
			}
			
		} while (!salir);
		
	    
		sc.close();
	}

}
