
package entidad;

import java.util.Comparator;

public class Comparador {
    
    public static Comparator <Pelicula> duracionDeMayorAMenor = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
          return t.getDuraccionPelicula().compareTo(t1.getDuraccionPelicula());
           
        }
    };
            
     public static Comparator <Pelicula>duracionDeMenorAMayor = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
          return t1.getDuraccionPelicula().compareTo(t.getDuraccionPelicula()); 
        }
    };
     
      public static Comparator <Pelicula> tituloAlfabeticamente = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
          return t.getTitulo().compareTo(t1.getTitulo()); 
        }
    };
      
      public static Comparator <Pelicula> dirrectorAlfabeticamente = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
          return t.getDirector().compareTo(t1.getDirector()); 
        }
      };    
}
