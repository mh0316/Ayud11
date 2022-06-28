package datos;

public enum MarcaVehiculo {
    SUSUKI("Suzuki"),
    TOYOTA("Toyota"),
    NISSAN("Nissan"),
    CHEVROLET("Chevrolet"),
    FERRARI("Ferrari"),
    BMW("BMW"),
    FORD("Ford");

    private String marcaVehiculo;
    private MarcaVehiculo(String marcaVehiculo){
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }


}
