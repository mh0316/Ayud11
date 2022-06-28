package modelo;

import datos.ColorVehiculo;
import datos.MarcaVehiculo;
import jdk.internal.icu.text.UnicodeSet;
import utils.GestorPDF;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Automotora {
	public List<Vehiculo> vehiculosAVenta;
	public List<Vehiculo> vehiculosVendidos;
	public List<Vehiculo> Vendedores;
	public List<Vehiculo> Clientes;
	private UnicodeSet ventas;
	private Vendedor[] vendedores;
	private Cliente[] clientes;

	public Automotora(){
		this.vehiculosAVenta= new ArrayList<Vehiculo>();
		this.vehiculosVendidos= new ArrayList<Vehiculo>();
		this.Vendedores = new ArrayList<Vehiculo>();
		this.Clientes = new ArrayList<>();
	}

	public List<Vehiculo> getClientes(){
		return Clientes;
	}

	public List<Vehiculo>  getVendedores(){
		return Vendedores;
	}

	public List<Vehiculo> getVehiculosAVenta() {
		return vehiculosAVenta;
	}

	public List<Vehiculo> getVehiculosVendidos() {
		return vehiculosVendidos;
	}

	public void añadirVehiculosPorVender(){
		this.vehiculosAVenta.add(new Vehiculo("Celerio", ColorVehiculo.BLANCO.getColorVehiculo(), MarcaVehiculo.SUSUKI.getMarcaVehiculo(),
				2018,5000000,40000.4));
		this.vehiculosAVenta.add(new Vehiculo("Hilux", ColorVehiculo.NEGRO.getColorVehiculo(), MarcaVehiculo.TOYOTA.getMarcaVehiculo(),
				2020,12000000,1000));
		this.vehiculosAVenta.add(new Vehiculo("Qashqai",ColorVehiculo.PLATEADO.getColorVehiculo(), MarcaVehiculo.NISSAN.getMarcaVehiculo(),
				2018,10590000,20000.23));
		this.vehiculosAVenta.add(new Vehiculo("Cruze",ColorVehiculo.GRIS.getColorVehiculo(), MarcaVehiculo.CHEVROLET.getMarcaVehiculo(),
				2010,4500000,105000.144));
		this.vehiculosAVenta.add(new Vehiculo("Sail",ColorVehiculo.DORADO.getColorVehiculo(), MarcaVehiculo.FERRARI.getMarcaVehiculo(),
				2020,6000000,70000));
		this.vehiculosAVenta.add(new Vehiculo("Sail",ColorVehiculo.VERDE.getColorVehiculo(), MarcaVehiculo.BMW.getMarcaVehiculo(),
				2019,15000000,130000));
		this.vehiculosAVenta.add(new Vehiculo("Sail",ColorVehiculo.ROJO.getColorVehiculo(), MarcaVehiculo.FORD.getMarcaVehiculo(),
				2015,50000000,100000));
	}
	public void venderAuto(String nombre, int año){
		for(Vehiculo auto: this.vehiculosAVenta){
			if(auto.getNombre().equals(nombre) && auto.getAño()==año){
				this.vehiculosVendidos.add(auto);
				this.vehiculosAVenta.remove(auto);
				break;
			}
		}
	}
	public List<Vehiculo> buscarAutoNombreForBasico(String nombre){
		List<Vehiculo> vehiculos= new ArrayList<>();
		for(int i=0; i<this.vehiculosAVenta.size(); i++){
			if(this.vehiculosAVenta.get(i).getNombre().equals(nombre)){
				vehiculos.add(this.vehiculosAVenta.get(i));
			}
		}
		return vehiculos;
	}

	public List<Vehiculo> buscarAutoNombre(String nombre){
		List<Vehiculo> vehiculos= new ArrayList<Vehiculo>();
		for(Vehiculo auto : this.vehiculosAVenta){
			if(auto.getNombre().equals(nombre)){
				vehiculos.add(auto);
			}
		}
		return vehiculos;
	}

	public List<Vehiculo> buscarAutoMarca(String marca){
		List<Vehiculo> vehiculos= new ArrayList<Vehiculo>();
		for(Vehiculo auto : this.vehiculosAVenta){
			if(auto.getMarca().equals(marca)){
				vehiculos.add(auto);
			}
		}
		return vehiculos;
	}
	public void mostrarAutosLista(List<Vehiculo> vehiculos){
		for(Vehiculo auto : vehiculos){
			String datos="nombre: "+auto.getNombre()+", marca: "+auto.getMarca()+", año: "+auto.getAño()
					+", color= "+auto.getColor()+", precio: "+auto.getPrecio()+", kmRecorridos: "+auto.getKmRecorridos();
			System.out.println(datos);
		}
	}
	public void probarSistema(){
		Automotora automotora= new Automotora();
		automotora.añadirVehiculosPorVender();
		automotora.mostrarAutosLista(automotora.buscarAutoNombre("Celerio"));
		automotora.venderAuto("Celerio",2018);
		automotora.mostrarAutosLista(automotora.getVehiculosVendidos());
	}

	public Venta generarVenta(String rutVendedor, String rutCliente, Vehiculo vehiculo) throws IOException{
		Vendedor vendedor = this.buscarVendedor(rutVendedor);
		Vendedor comprador = this.buscarCliente(rutCliente);
		Venta venta = new Venta(vehiculo, comprador, vendedor);
		this.ventas.add((CharSequence) venta);
		GestorPDF gestorPDF = new GestorPDF();
		gestorPDF.generarBoleta(venta);
		return venta;
	}

	public Vendedor buscarCliente(String rut){
		Vendedor cliente = null;
		Cliente clientes = null;
		for(Cliente clienteAux : this.clientes){
			if(clienteAux.getRun().equals(rut)){
				clientes = clienteAux;
				break;
			}
		}
		if(cliente==null){
			for(Vendedor vendedorAux : this.vendedores){
				if(Objects.equals(vendedorAux.getRun(), rut)){
					cliente = vendedorAux;
					break;
				}
			}
		}
		return cliente;
	}

	public Vendedor buscarVendedor(String rut){
		Vendedor vendedor = null;
		for(Vendedor vendedorAux : this.vendedores){
			if(Objects.equals(vendedorAux.getRun(), rut)){
				vendedor = vendedorAux;
			}
		}
		return vendedor;
	}
}