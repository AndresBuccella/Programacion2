package streaming.filtros;

import streaming.Pelicula;

public class FiltroOr extends Filtro {
    private Filtro filtroA;
    private Filtro filtroB;
    public FiltroOr(Filtro filtroA, Filtro filtroB) { this.filtroA = filtroA; this.filtroB = filtroB; }
    public boolean cumple(Pelicula p){
        return filtroA.cumple(p) || filtroB.cumple(p);
    }
}
