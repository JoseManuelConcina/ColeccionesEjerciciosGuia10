package entidad;

public class RazaPerro {

    private int edad;
    private String nombre;
    private String raza;

    public RazaPerro() {
    }

    public RazaPerro(int edad, String nombre, String raza) {
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "RazaPerro { nombre = " + nombre + " , edad = " + edad +  " , raza = "+ raza + '}';
    }

}
