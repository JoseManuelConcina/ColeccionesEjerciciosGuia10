
package entidad;

import java.util.ArrayList;
import java.util.Comparator;


public class Comparador {
     ArrayList <RazaPerro> razas;
    
    public static Comparator<RazaPerro> compararRaza = new Comparator <RazaPerro>() {
         @Override
         public int compare(RazaPerro t, RazaPerro t1) {
             return t1.getRaza().compareTo(t.getRaza());
         }
     };
    }
