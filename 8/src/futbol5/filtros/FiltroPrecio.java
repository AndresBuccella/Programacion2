package futbol5.filtros;

import futbol5.Socio;

public class FiltroPrecio  extends Filtro{
    private double precio;
    public FiltroPrecio(double precio) { this.precio = precio; }
    public boolean cumple(Socio s) {
        return s.pagoMasDe(this.precio);
    }
}
