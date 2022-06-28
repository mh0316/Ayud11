package utils;

import java.util.Scanner;

public class VerificarRut{

    public void ingresoRut(){
        String rut="20761456-3";
        validarRut(ingresarRut());
    }
    private static String ingresarRut() {
        String rut;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el Rut");
        rut = teclado.next();
        return (rut);
    }
    private static boolean validarRut(String rut) {
        boolean validacion = false;
        try {
            rut =  rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
                System.out.println("El rut es válido");
            }else{
                System.out.println("El rut es inválido");
            }
        } catch (Exception e) {
        }
        return validacion;
    }
}