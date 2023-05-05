
package main;

import entidad.Pais;
import java.util.TreeSet;

import servicio.PaisServicio;

public class main {
    public static void main(String[] args) {
        Pais p = new Pais ();
        PaisServicio ps = new PaisServicio ();
        TreeSet <Pais> objetos= new TreeSet();
       
        
        System.out.println("Comience agregando Paises");
        ps.agregarPais(objetos);
        System.out.println("--------------------------------------------------");
        System.out.println("Mostrando los paises ordenados alfabeticamente");
        ps.mostrar(objetos);
        System.out.println("--------------------------------------------------");
        System.out.println("Buscar y eliminar el pais del TreeSet");
        ps.borrar(objetos);
        
    }
}
