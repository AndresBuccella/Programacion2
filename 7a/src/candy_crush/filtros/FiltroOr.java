package candy_crush.filtros;

import candy_crush.Ficha;

public class FiltroOr extends FiltroFicha{
    private FiltroFicha filtro1;
    private FiltroFicha filtro2;
    public FiltroOr(FiltroFicha f1, FiltroFicha f2) { filtro1 = f1; filtro2 = f2; }
    public boolean cumple(Ficha f){
        return this.filtro1.cumple(f) || this.filtro2.cumple(f);
    }
}
