package vivero.filtros;

import vivero.Planta;

public class FiltroClasificacion extends Filtro{
    private String clasificacion;
    public FiltroClasificacion(String clasificacion) { this.clasificacion = clasificacion; }

    @Override
    public boolean cumple(Planta p) {
        return p.getClasificacionSuperior().equals(this.clasificacion);
    }
}
