package candy_crush.filtros;

import candy_crush.Ficha;

public class FiltroPoderDeDestruccion extends FiltroFicha{
    private int poderLimite;
    public FiltroPoderDeDestruccion(int poderLimite) { this.poderLimite = poderLimite; }
    public boolean cumple(Ficha f){
        return f.getPoderDeDestruccion() > poderLimite;
    }
}
