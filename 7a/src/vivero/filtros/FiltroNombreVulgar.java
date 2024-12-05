package vivero.filtros;

import vivero.Planta;

public class FiltroNombreVulgar extends Filtro{
    private String nombre;
    public FiltroNombreVulgar(String nombre) { this.nombre = nombre; }

    @Override
    public boolean cumple(Planta p) {
        return p.containsNombreVulgar(this.nombre);
    }
}
