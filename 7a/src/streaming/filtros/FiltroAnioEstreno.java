package streaming.filtros;

import streaming.Pelicula;

import java.time.LocalDate;

public class FiltroAnioEstreno extends Filtro {
    private LocalDate fechaEstreno;
    public FiltroAnioEstreno(LocalDate fechaEstreno) { this.fechaEstreno = fechaEstreno; }

    @Override
    public boolean cumple(Pelicula p) {
        return p.getFechaEstreno().isBefore(fechaEstreno);
    }
}
