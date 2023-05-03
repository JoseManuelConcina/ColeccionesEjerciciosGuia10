
package main;

import entidad.RazaPerro;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.RazaPerroServicio;

public class Main {
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RazaPerro rp = new RazaPerro();
        RazaPerroServicio rps = new RazaPerroServicio();
        ArrayList <RazaPerro> razas = new ArrayList();
        String opcion = "";
        do {
            rps.cargarPerros(razas);
            System.out.println("Desea agregar otro perro prisione s de lo contrario presione   n :");
            opcion = leer.next();
        } while (!opcion.equalsIgnoreCase("n"));
        
        rps.mostarRazas(razas);
        rps.verificarLista(razas);
        rps.mostarRazasOrdenada(razas);
    }

}
