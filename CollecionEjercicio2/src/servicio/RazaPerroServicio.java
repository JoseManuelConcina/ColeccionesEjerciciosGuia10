package servicio;

import entidad.Comparador;
import entidad.RazaPerro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class RazaPerroServicio {

    Scanner leer = new Scanner(System.in);
   

    public void cargarPerros(ArrayList <RazaPerro> razas) {

        System.out.println("Ingrese el nombre del perro");
        String nombre = leer.next();
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Ingrese la edad de: " + nombre);
        int edad = leer.nextInt();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Ingrese la raza de : " + nombre);
        String raza = leer.next();
        System.out.println("------------------------------------------------------------------");
        RazaPerro rp = new RazaPerro(edad, nombre, raza);
        razas.add(rp);

    }

    public void mostarRazas(ArrayList <RazaPerro> razas) {

        for (RazaPerro aux : razas) {

            System.out.println(aux);
        }
        System.out.println("La cantidad de perros en la lista es de : " + razas.size());

    }

    /*
    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
     */
    public void verificarLista(ArrayList <RazaPerro> razas) {
        System.out.println("Ingrese el nombre de un perro para verificar si esta en la lista y borrarlo ");
        String verificador = leer.next();

        Iterator<RazaPerro> it = razas.iterator();

        while (it.hasNext()) {
            RazaPerro aux = it.next();
            if (aux.getNombre().equals(verificador)) {
                it.remove();
                System.out.println("El perro " + aux + " ha sido eliminado de la lista.");
            }else {
                System.out.println("El perro no se encuentra en la lista.");
            }
        }

    }

    public void mostarRazasOrdenada(ArrayList <RazaPerro> razas) {
       Collections.sort(razas,Comparador.compararRaza);
        System.out.println(" ");
        System.out.println("La lista ordenada en forma decrecreciente cadaria asi:" );
       for (RazaPerro aux : razas) {
             System.out.println(aux);
        }
    } 

}
