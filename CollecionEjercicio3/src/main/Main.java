package main;

import entidad.Alumno;
import java.util.ArrayList;
import servicio.AlumnoServicio;

public class Main {

    public static void main(String[] args) {
        Alumno al = new Alumno();
        AlumnoServicio as = new AlumnoServicio();
        ArrayList<Alumno> lista = new ArrayList<>();
        as.crearAlumno(lista);
        System.out.println("-------------------------------------------------");
        as.ordenarLista(lista);
        System.out.println("--------------------------------------------------");
        as.notaFinal(lista);

    }
}
