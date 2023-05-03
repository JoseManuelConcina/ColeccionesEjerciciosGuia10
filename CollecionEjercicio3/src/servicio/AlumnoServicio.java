package servicio;
import comparador.Comparador;
import entidad.Alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlumnoServicio {

    Scanner leer = new Scanner(System.in);
   

    public void crearAlumno( ArrayList<Alumno> lista ) {

        String opcion = "";
        do {

            System.out.println("Ingrese el nombre del alumno ");
            String nombre = leer.next();
            Alumno al = new Alumno(nombre);
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la  nota nro" + (i + 1) + "  del alumno " + nombre);
                int nota = leer.nextInt();
                al.agregarNota(nota);

            }
            lista.add(al);
            System.out.println("Desea cargar otro alumno *** S/N *** ");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
 
    }
   public  void  ordenarLista ( ArrayList<Alumno> lista){
     Collections.sort(lista,Comparador.compararNombre);
       for (Alumno aux : lista) {
           System.out.println(aux);
       }
    
   }
    public void notaFinal( ArrayList<Alumno> lista) {
        double promedio = 0;
        double suma=0;

        System.out.println("Ingrese el nombre del alumno para calcular su promedio");
        String nombre = leer.next();
        Alumno al = null;
        for (Alumno a : lista) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                al = a;
                break;
            }
        }

        if (al == null) {
            System.out.println("El alumno no se encuentra en la lista.");
            return;
        }

        for (int nota : al.getNotas()) {
            suma += nota;
        }

        promedio = suma / al.getNotas().size();

        System.out.println("El promedio de las notas del alumno " + al.getNombre() + " es de " + promedio);
    }
  
}
