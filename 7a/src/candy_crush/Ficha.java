package candy_crush;

public class Ficha {
    private String nombre;
    private int fortaleza;
    private int espacio;
    private int poderDeDestruccion;

    public Ficha(String nombre, int fortaleza, int espacio, int poderDeDestruccion) { this.nombre = nombre; this.fortaleza = fortaleza; this.espacio = espacio; this.poderDeDestruccion = poderDeDestruccion; }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFortaleza() {
        return fortaleza;
    }
    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getEspacio() {
        return espacio;
    }
    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public int getPoderDeDestruccion() {
        return poderDeDestruccion;
    }
    public void setPoderDeDestruccion(int poderDeDestruccion) {
        this.poderDeDestruccion = poderDeDestruccion;
    }
}
