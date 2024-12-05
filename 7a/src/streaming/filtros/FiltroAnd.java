package streaming.filtros;

import streaming.Pelicula;

public class FiltroAnd extends Filtro {
    private Filtro filtroA;
    private Filtro filtroB;
    public FiltroAnd(Filtro filtroA, Filtro filtroB) { this.filtroA = filtroA; this.filtroB = filtroB; }
    public boolean cumple(Pelicula p){
        return filtroA.cumple(p) && filtroB.cumple(p);
    }
    public Filtro getFiltroA() { return filtroA; }
    public Filtro getFiltroB() { return filtroB; }

    public boolean equals(Object o){
        FiltroAnd f = (FiltroAnd) o;
        return (filtroA.equals(f.filtroA) && filtroB.equals(f.filtroB)) ||
                (filtroA.equals(f.filtroB) && filtroB.equals(f.filtroA));
    }
}
