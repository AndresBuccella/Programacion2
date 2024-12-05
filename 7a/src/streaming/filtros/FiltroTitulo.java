package streaming.filtros;

import streaming.Pelicula;

public class FiltroTitulo extends Filtro {
    private String titulo;
    public FiltroTitulo(String titulo) { this.titulo = titulo; }
    public boolean cumple(Pelicula p){
        return p.getTitulo().toLowerCase().contains(titulo.toLowerCase());
    }
}
