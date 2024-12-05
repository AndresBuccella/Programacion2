package streaming.filtros;

import streaming.Pelicula;

public class FiltroDuracion extends Filtro {
    private int duracion;
    public FiltroDuracion(int duracion) { this.duracion = duracion; }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getDuracion() < duracion;
    }
}
