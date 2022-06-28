package modelo;

import datos.ColorVehiculo;
import datos.MarcaVehiculo;

public class Vehiculo {

	protected String run;
	private double kmRecorridos=0;
	private int cantidadCombustible=0;
	private String nombre;
	private String color;
	private String marca;
	private int año;
	private int precio;
	private double KmRecorridos;

	public Vehiculo(String nombre, String color, String marca, int año, int precio, double kmRecorridos){
		this.nombre=nombre;
		this.color=color;
		this.marca=marca;
		this.año=año;
		this.precio=precio;
		this.kmRecorridos=kmRecorridos;
		this.cantidadCombustible=0;
	}
	
	public Vehiculo(){
		String nombre;
		String color;
		String marca;
		int año;
		String precio;
		double kmRecorridos;
	}

	public Vehiculo(String datum, ColorVehiculo valueOf, MarcaVehiculo valueOf1, int año, int precio, double kmRecorridos) {}

	public Vehiculo(String nombre, String rut) {}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public int getAño(){
		return año;
	}
	public void setAño(String año){
		this.año = Integer.parseInt(año);
	}
	public int getPrecio(){
		return precio;
	}
	public void setPrecio(String precio){
		this.precio = Integer.parseInt(precio);
	}
	public double getKmRecorridos(){
		return KmRecorridos;
	}
	public void setKmRecorridos(String KmRecorridos){
		this.KmRecorridos = Double.parseDouble(KmRecorridos);
	}

	public double obtenerDescuento() {
		return 0;
	}
}