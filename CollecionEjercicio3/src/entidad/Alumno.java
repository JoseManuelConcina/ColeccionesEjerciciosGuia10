package entidad;

import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private ArrayList<Integer> notas;

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<Integer>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void agregarNota(int nota) {
        notas.add(nota);
    }

    @Override
    public String toString() {
        return "Alumno { " + " nombre = " + nombre + " , notas = " + notas + '}';
    }
        

}


