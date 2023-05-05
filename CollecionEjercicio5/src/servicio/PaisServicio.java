package servicio;

import entidad.Pais;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void agregarPais(TreeSet<Pais> objetos) {
        String opcion = "";
        do {
            Pais p = new Pais();
            System.out.println("Agrege un pais :");
            p.setPais(leer.next());
            objetos.add(p);
            System.out.println(" Desea ingresar otro pais S/N ");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));

    }

    public void mostrar(TreeSet<Pais> objetos) {

        System.out.println(objetos);

        System.out.println("");
    }

    public void borrar(TreeSet<Pais> objetos) {
    Iterator<Pais> it = objetos.iterator();
    System.out.println("Ingrese un pais para ver si esta el la lista y borrarlo");
    String verificador = leer.next();
    boolean encontrado = false;

    while (it.hasNext()) {
        Pais aux = it.next();
        if (aux.getPais().equals(verificador)) {
            it.remove();
            System.out.println("El País " + aux + " ha sido eliminado de la lista.");
            encontrado = true;
            break; // Salir del bucle si se ha encontrado el país
        }
    }

    if (!encontrado) {
        System.out.println("El País no se encuentra en la lista.");
    }
}

}
