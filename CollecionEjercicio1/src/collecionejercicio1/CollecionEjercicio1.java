package collecionejercicio1;

import entidad.RazaPerro;
import java.util.ArrayList;
import java.util.Scanner;

import servicios.RazaPerroServicio;

public class CollecionEjercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RazaPerro rp = new RazaPerro();
      ArrayList<RazaPerro> razas = new ArrayList<>();
        RazaPerroServicio rps = new RazaPerroServicio();
        String opcion = "";
        do {

            rps.cargarPerros(razas);
            System.out.println("Dese agregar los datos del perro prisione s de lo contrario presione   n :");
            opcion = leer.next();

        } while (!opcion.equalsIgnoreCase("n"));

        rps.mostarRazas(razas);
    }

}
