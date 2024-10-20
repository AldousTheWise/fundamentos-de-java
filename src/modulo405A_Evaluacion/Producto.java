package modulo405A_Evaluacion;

public class Producto {
	private String nombre, descripcion;
	private int precio;
	
	
	/* Constructor */
	public Producto(String nombre, int precio, String descripcion) {
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
	}


	/* Setters*/
	public void setNombre(String nombre) { this.nombre = nombre; }
	public void setPrecio(int precio) { this.precio = precio; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

	/* Getters*/
	public String getNombre() { return nombre; }
	public int getPrecio() { return precio; }
    public String getDescripcion() { return descripcion; }

	@Override
	public String toString() {
		return "Producto: " + getNombre() + " - Valor: " + getPrecio() + " - Descripcion: " + getDescripcion();
	}
	
}
