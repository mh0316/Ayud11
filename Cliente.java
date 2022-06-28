package modelo;

public class Cliente extends Vehiculo {

	private String direccion, numeroTelefonico,correo;
	private boolean primerCompra;

	public Cliente(String nombre, String direccion, String numeroTelefonico, String correo, String rut){
		super(nombre, rut);
		this.direccion = direccion;
		this.numeroTelefonico = numeroTelefonico;
		this.correo = correo;
		this.primerCompra = true;
		char data[] = {'a','b','c'};
		String str = new String(data);
	}

	public Cliente(String datum, String datum1, int parseInt) {
	}

	public String getDireccion(){
		return direccion;
	}

	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public String getNumeroTelefonico(){
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico){
		this.numeroTelefonico = numeroTelefonico;
	}

	public String getCorreo(){
		return correo;
	}

	public void setCorreo(String correo){
		this.correo = correo;
	}

	public double obtenerDescuento(){
		if(this.primerCompra=true){
			this.primerCompra=false;
			return 0.8;
		}else{
			return 1;
		}
	}

	@Override
	public String toString(){
		return super.getNombre() +","+this.direccion+","+this.numeroTelefonico+","+this.correo+","+super.run;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run){
		this.run = run;
	}
}
