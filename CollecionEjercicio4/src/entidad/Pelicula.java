
package entidad;

public class Pelicula {
    private String titulo;
    private String director;
    private Integer duraccionPelicula;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duraccionPelicula) {
        this.titulo = titulo;
        this.director = director;
        this.duraccionPelicula = duraccionPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuraccionPelicula() {
        return duraccionPelicula;
    }

    public void setDuraccionPelicula(Integer duraccionPelicula) {
        this.duraccionPelicula = duraccionPelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + " titulo = " + titulo + ", director = " + director + " , duraccionPelicula = " + duraccionPelicula + '}';
    }
    
    
    
}
