package futbol5.filtros;

import futbol5.Socio;

public class FiltroEdad extends Filtro {
    private int edadMinima;
    public FiltroEdad(int edadMinima) { this.edadMinima = edadMinima; }
    public boolean cumple(Socio s) {
        return s.getEdad() > this.edadMinima;
    }
}
