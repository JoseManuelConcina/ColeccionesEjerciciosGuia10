
package entidad;

public class Pais implements Comparable<Pais> {
    private String pais;

    public Pais() {
    }

    public Pais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Pais{" + " pais = " + pais + '}';
    }

    @Override
    public int compareTo(Pais otroPais) {
        return this.pais.compareTo(otroPais.getPais());
    }   
}







