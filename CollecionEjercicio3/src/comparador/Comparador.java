
package comparador;

import entidad.Alumno;
import java.util.Comparator;

public class Comparador {
    
    public static Comparator<Alumno> compararNombre = new Comparator<Alumno> () {
        @Override
        public int compare(Alumno a1, Alumno a2) {
           return a1.getNombre().compareTo(a2.getNombre());
        }
    };
           
}
