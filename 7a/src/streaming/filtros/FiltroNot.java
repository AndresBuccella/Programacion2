package streaming.filtros;

import streaming.Pelicula;

public class FiltroNot {
    private Filtro filtroANegar;
    public FiltroNot(Filtro filtroANegar) { this.filtroANegar = filtroANegar; }
    public boolean cumple(Pelicula p){
        return !filtroANegar.cumple(p);
    }
}
