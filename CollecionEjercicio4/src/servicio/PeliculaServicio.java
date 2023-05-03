package servicio;

import entidad.Comparador;
import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;


public class PeliculaServicio {

    Scanner leer = new Scanner(System.in);
   

    public void crearpelicula( ArrayList<Pelicula> lista) {
        String opcion = "";
        do {
            System.out.println("Ingrese el Titulo de la pelicula");
            String titulo = leer.next();
            System.out.println("----------------------------------");
            System.out.println("Ingrese el nombre del Director ");
            String nombre = leer.next();
            System.out.println("------------------------------------");
            System.out.println("Ingrese la duracion de la pelucula (en minutos) :");
            Integer duracion = leer.nextInt();
            System.out.println("------------------------------------");
            System.out.println("Desea agregar otra pelicula *** S/N ***");
            opcion = leer.next();
            Pelicula peli = new Pelicula(titulo, nombre, duracion);
            lista.add(peli);
        } while (opcion.equalsIgnoreCase("s"));
    }

    public void mostrarPeliculas( ArrayList<Pelicula> lista) {
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
        System.out.println(" ");
    }

    public void mostrarPeliculasLargas( ArrayList<Pelicula> lista) {

        for (Pelicula aux : lista) {
            if (aux.getDuraccionPelicula() > 60) {
                System.out.println("La pelicula : " + aux.getTitulo() + " del Director : " + aux.getDirector() + " , dura mas de una hora");
            }
        }
        System.out.println(" ");
       
    }
    public void segunDuracionDecreciente (ArrayList<Pelicula> lista){
        Collections.sort(lista, Comparador.duracionDeMayorAMenor);
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
        System.out.println(" ");
    }
    
   public void segunDuracionCreciente (ArrayList<Pelicula> lista){
        Collections.sort(lista, Comparador.duracionDeMenorAMayor);
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
        System.out.println(" ");
    }
   public void segunTituloAlfaveticamente (ArrayList<Pelicula> lista){
        Collections.sort(lista, Comparador.tituloAlfabeticamente);
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
        System.out.println(" ");
    }
   public void segunDirectorAlfabeticamente (ArrayList<Pelicula> lista){
        Collections.sort(lista, Comparador.dirrectorAlfabeticamente);
        for (Pelicula aux : lista) {
            System.out.println(aux);
        }
        System.out.println(" ");
    }
}
