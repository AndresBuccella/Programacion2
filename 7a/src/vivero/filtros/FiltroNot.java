package vivero.filtros;

import vivero.Planta;

public class FiltroNot extends Filtro {
    private Filtro filtroANegar;
    public FiltroNot(Filtro filtroANegar) { this.filtroANegar = filtroANegar; }
    public boolean cumple(Planta p){
        return !this.filtroANegar.cumple(p);
    }
}
