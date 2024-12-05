package candy_crush.filtros;

import candy_crush.Ficha;

public class FiltroNot extends FiltroFicha {
    private FiltroFicha filtroANegar;
    public FiltroNot(FiltroFicha filtroANegar) { this.filtroANegar = filtroANegar; }
    public boolean cumple(Ficha f){
        return !this.filtroANegar.cumple(f);
    }
}
