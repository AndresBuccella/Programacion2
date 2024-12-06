package futbol5.filtros;

import futbol5.Cancha;
import futbol5.Socio;

public class FiltroAlquiloCancha extends Filtro{
    private Cancha cancha;
    public FiltroAlquiloCancha(Cancha cancha){ this.cancha = cancha; }
    public boolean cumple(Socio s){
        return s.alquiloCancha(this.cancha);
    }
}
