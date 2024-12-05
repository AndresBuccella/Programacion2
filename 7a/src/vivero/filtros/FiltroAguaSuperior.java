package vivero.filtros;

import vivero.Planta;

public class FiltroAguaSuperior extends Filtro {
    private int cantAgua;
    public FiltroAguaSuperior(int cantAgua) { this.cantAgua = cantAgua; }
    public boolean cumple(Planta p){
        return p.getRequerimientoAgua() >= this.cantAgua;
    }
}
