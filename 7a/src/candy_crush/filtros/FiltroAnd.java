package candy_crush.filtros;

import candy_crush.Ficha;

public class FiltroAnd extends FiltroFicha {
    private FiltroFicha filtro1;
    private FiltroFicha filtro2;
    public FiltroAnd(FiltroFicha filtro1, FiltroFicha filtro2) { this.filtro1 = filtro1; this.filtro2 = filtro2; }

    @Override
    public boolean cumple(Ficha f) {
        return this.filtro1.cumple(f) && this.filtro2.cumple(f);
    }
}
