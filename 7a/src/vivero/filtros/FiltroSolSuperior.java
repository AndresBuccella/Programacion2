package vivero.filtros;

import vivero.Planta;

public class FiltroSolSuperior extends Filtro {
    private int cantSol;
    public FiltroSolSuperior(int cantSol) { this.cantSol = cantSol; }

    @Override
    public boolean cumple(Planta p){
        return p.getRequerimientoSol() >= this.cantSol;
    }
}
