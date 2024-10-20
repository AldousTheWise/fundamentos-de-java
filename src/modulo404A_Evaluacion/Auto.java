package modulo404A_Evaluacion;

public class Auto {
	/* Atributos */
	 private String marca, modelo, color;
	 private int velocidadMaxima;
	 private boolean encendido;
	 
	 /* Constructor*/
	 public Auto (String marca, String modelo, String color, int velocidadMaxima) {
		 this.marca = marca;
		 this.modelo = modelo;
		 this.color = color;
		 this.velocidadMaxima = velocidadMaxima;
		 this.encendido = false;
		 }
	 
	 /* Setters*/
	 public void setMarca(String marca) { this.marca = marca;}
	 public void setModelo(String modelo) { this.modelo = modelo; }
	 public void setColor (String color) { this.color = color; }
	 public void setVelocidadMaxima(int velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }
	 public void setEncendido(boolean encendido) { this.encendido = encendido; }
	 
	 /* Getters */
	 public String getMarca() { return marca; }
	 public String modelo() { return modelo; }
	 public String color() { return color; }
	 public int velocidadMaxima() { return velocidadMaxima; }
	 public boolean isEncendido() { return encendido; }
	 
	 /* Métodos */
	 public void encender() {
		 if(!isEncendido()) { 
			 encendido = true; 
			 System.out.println("El auto está encendido.");
		 } else { 
			System.out.println("El auto ya está encendido."); 
	     }
	 }
	 public void apagar() {
		 if(isEncendido()) {
			 encendido = false;
			 System.out.println("El auto está apagado.");
		 } else {
			 System.out.println("El auto ya está apagado");
		 }
	 }
	 public void acelerar() {
		 if (isEncendido()) {
			System.out.println("Advertencia: El auto aceleró.");
		} else { 
			System.out.println("El auto no puede acelerar estando apagado.");
		}
	 }
	 
	 @Override
	 public String toString() {
		return "Auto [ marca = " + marca + ", modelo = " + modelo + ", color = " + color + ", velocidad máxima = " + velocidadMaxima + " kms/hora , encendido = " + encendido + " ]";	 
	 }

}
