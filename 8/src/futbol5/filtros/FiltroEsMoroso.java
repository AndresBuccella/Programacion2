package futbol5.filtros;

import futbol5.Socio;

public class FiltroEsMoroso extends Filtro{
    public boolean cumple(Socio s){
        return !s.getUltimaCuota();
    }
}
