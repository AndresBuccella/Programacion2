package streaming.filtros;

import streaming.Pelicula;

public class FiltroDirector {
    private String director;
    public FiltroDirector(String director) { this.director = director; }
    public boolean cumple(Pelicula p){
        return p.getDirector().equals(director);
    }
}
