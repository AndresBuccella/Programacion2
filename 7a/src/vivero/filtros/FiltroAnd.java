package vivero.filtros;

import vivero.Planta;

public class FiltroAnd extends Filtro {
    private Filtro filtroA;
    private Filtro filtroB;
    public FiltroAnd(Filtro filtroA, Filtro filtroB) { this.filtroA = filtroA; this.filtroB = filtroB; }
    public boolean cumple(Planta p){
        return filtroA.cumple(p) && filtroB.cumple(p);
    }
}
