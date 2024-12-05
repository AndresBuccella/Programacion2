package candy_crush.filtros;

import candy_crush.Ficha;

public class FiltroFichaFortaleza extends FiltroFicha {
    private int fortaleza;
    public FiltroFichaFortaleza(int fortaleza) { this.fortaleza = fortaleza; }
    public boolean cumple(Ficha f){
        return f.getFortaleza() > this.fortaleza;
    }
}
