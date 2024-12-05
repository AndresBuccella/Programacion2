package candy_crush.filtros;

import candy_crush.Ficha;

public class FiltroFichaTamanio extends FiltroFicha{
    private int tamanio;
    public FiltroFichaTamanio(int tamanio) { this.tamanio = tamanio; }
    public boolean cumple(Ficha f){
        return f.getEspacio() > this.tamanio;
    }
}
