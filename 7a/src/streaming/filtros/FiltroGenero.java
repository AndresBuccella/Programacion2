package streaming.filtros;

import streaming.Pelicula;

public class FiltroGenero extends Filtro {
    private String genero;
    public FiltroGenero(String genero) { this.genero = genero; }
    public boolean cumple(Pelicula p){
        return p.containsGenero(this.genero);
    }
}
