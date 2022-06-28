package modelo;

import modelo.Persona;
import modelo.Vendedor;

import java.util.Calendar;
import java.util.Date;

public class Venta extends Vendedor {
    private String Vendedor;
    private String Cliente;
    private String vehiculoComprado;
    private String obtenerLineasPDF;
    private String Fecha;
    private String Vehiculo;
    private static String nombre;

    public Venta(String Vendedor, String Cliente, String vehiculoComprado, String obtenerLineasPDF, String Fecha) {
        super();
        this.Vendedor = Vendedor;
        this.Cliente = Cliente;
        this.vehiculoComprado = vehiculoComprado;
    }

    public Venta(Vehiculo vehiculo, Persona comprador, Vendedor vendedor) {
        super();
    }

    public Venta(Vehiculo vehiculo, modelo.Cliente comprador, Vendedor vendedor) {
        super();
    }

    public Venta(Vehiculo vehiculo, Vendedor comprador, modelo.Vendedor vendedor) {
        super();
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getVehiculoComprado() {
        return vehiculoComprado;
    }

    public void setVehiculoComprado(String vehiculoComprado) {
        this.vehiculoComprado = vehiculoComprado;
    }

    public String getobtenerLineasPDF(String obtenerLineasPDF) {
        return obtenerLineasPDF;
    }

    public void setobtenerLineasPDF() {
        this.obtenerLineasPDF = obtenerLineasPDF;
    }
    public Date getFecha(){
        Date Fecha = Calendar.getInstance().getTime();
        return Fecha;
    }

    public void setFecha(){
        this.Fecha = Fecha;
    }

    public String getVehiculo(){
        return Vehiculo;
    }

    public void setVehiculo(){
        this.Vehiculo = Vehiculo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

	public String getFecha(String Fecha) {
		// TODO - implement modelo.Venta.getFecha
		throw new UnsupportedOperationException();
	}
}