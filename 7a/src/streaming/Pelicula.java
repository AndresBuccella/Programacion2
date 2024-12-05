package streaming;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String director;
    private ArrayList<String> actores;
    private ArrayList<String> generos;
    private LocalDate fechaEstreno;
    private int duracion;
    private int edadMinima;

    public Pelicula(String titulo, LocalDate fechaEstreno, int duracion, int edadMinima){
        this.titulo = titulo;
        this.fechaEstreno = fechaEstreno;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.actores = new ArrayList<>();
        this.generos = new ArrayList<>();
    }

    public void setActor(String actor){
        if (!actores.contains(actor))
            this.actores.add(actor);
    }
    public boolean containsActor(String actor){
        return actores.contains(actor);
    }

    public void setGenero(String genero){
        if (!generos.contains(genero))
            this.generos.add(genero);
    }
    public boolean containsGenero(String genero){
        return generos.contains(genero);
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }
    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }
    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
}
