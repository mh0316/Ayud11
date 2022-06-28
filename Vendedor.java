package modelo;

public class Vendedor extends Persona {
    private static String nombre;
    private String rut;
    private int edad;
    private int run;

    public Vendedor(String nombre, String rut, int edad){
        super(nombre, rut);
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.run = Integer.parseInt(String.valueOf(run));

        /*String nombre;
        String rut;
        int edad;*/
    }

    public Vendedor() {
        super();
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getRut(){
        return rut;
    }
    public void setRut(String rut){
        this.rut = rut;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getRun(){
        return run;
    }

    public void setRun(String run){
        this.run = Integer.parseInt(run);
    }

    public double obtenerDescuento(){
        return 0.9;
    }

    @Override
    public String toString(){
        return super.getNombre() +","+super.run+","+this.edad;
    }
}