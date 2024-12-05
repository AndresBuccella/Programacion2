package candy_crush;

import java.util.ArrayList;

public class Tablero {
    private int puntajeMinimo;
    ArrayList<Ficha> fichas;
    public Tablero(int puntajeMinimo) { this.puntajeMinimo = puntajeMinimo; }
    public void setFicha(Ficha ficha) { this.fichas.add(ficha); }

    public int getDificultad() {
        int fortaleza = 0;
        int poderDeDestruccion = 0;
        for (Ficha ficha : fichas) {
            fortaleza += ficha.getFortaleza();
            poderDeDestruccion += ficha.getPoderDeDestruccion();
        }
        return fortaleza / poderDeDestruccion;
    }
}
