
package main;

import entidad.Pelicula;
import java.util.ArrayList;
import servicio.PeliculaServicio;

public class CollecionEjercicio4 {

    public static void main(String[] args) {
      
        Pelicula peli = new Pelicula ();
        PeliculaServicio ps = new PeliculaServicio();
         ArrayList<Pelicula> lista = new ArrayList();
         
        ps.crearpelicula(lista);
        System.out.println("----------------------------------------------------");
        ps.mostrarPeliculas(lista);
        System.out.println("----------------------------------------------------");
        ps.mostrarPeliculasLargas(lista);
        System.out.println("----------------------------------------------------");
        ps.segunDuracionDecreciente(lista);
        System.out.println("----------------------------------------------------");
        ps.segunDuracionCreciente(lista);
        System.out.println("----------------------------------------------------");
        ps.segunTituloAlfaveticamente(lista);
        System.out.println("----------------------------------------------------");
        ps.segunDirectorAlfabeticamente(lista);
        
    }
    
}
