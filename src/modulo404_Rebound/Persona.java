package modulo404_Rebound;

public class Persona {
	String nombre;
	   int edad, peso;
	   float altura;
	   
	   /* Constructor Persona */
	   public Persona(String nombre, int edad, int peso, float altura) {
		   this.nombre = nombre;
		   this.edad = edad;
		   this.peso = peso;
		   this.altura = altura;
	   };
	   
	   /* Setters */
	   public void setNombre(String nombre) { this.nombre = nombre; } 
	   public void setEdad(int edad) { this.edad = edad; }
	   public void setPeso(int peso) { this.peso = peso;}
	   public void setAltura(float altura) { this.altura = altura; }
	   
	   /* Getters */
	   
	   public String getNombre() { return this.nombre; }
	   public int getEdad() { return this.edad; }
	   public int getPeso() { return this.peso; }
	   public float getAltura() { return this.altura; }   
	   
	   /* Override */
	   
	   public String toString() {
		   return "Persona [ Nombre = " + getNombre() + ", Edad = " + getEdad() + ", peso= " + getPeso() +  ", altura = " + getAltura() + " ]"; 
	   }

}
