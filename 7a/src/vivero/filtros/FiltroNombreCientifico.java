package vivero.filtros;

import vivero.Planta;

public class FiltroNombreCientifico extends Filtro{
    private String nombre;
    public FiltroNombreCientifico(String nombre) { this.nombre = nombre; }

    @Override
    public boolean cumple(Planta p) {
        return p.getNombreCientifico().contains(this.nombre);
    }
}
