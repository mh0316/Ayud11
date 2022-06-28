package datos;

import java.awt.*;

public enum ColorVehiculo {
    BLANCO("Blanco"),
    NEGRO("Negro"),
    PLATEADO("Plateado"),
    GRIS("Gris"),
    DORADO("Dorado"),
    VERDE("Verde"),
    ROJO("Rojo");

    private String colorVehiculo;
    private ColorVehiculo(String colorVehiculo){
        this.colorVehiculo = colorVehiculo;
    }

    public String getColorVehiculo(){
        return colorVehiculo;
    }
}
