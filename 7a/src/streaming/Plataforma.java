package streaming;

import streaming.filtros.Filtro;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {

    private ArrayList<Pelicula> peliculas;
    private ArrayList<Filtro> condiciones;

    public Plataforma() {
        this.condiciones = new ArrayList<>();
    }

    //Redefinir equals en cada filtro concreto para que funcione
    public void setCondicion(Filtro filtro) {
        if (!condiciones.contains(filtro)) {
            this.condiciones.add(filtro);
        }
    }
    public void deleteCondicion(Filtro filtro) {
        condiciones.remove(filtro);
    }

    public Iterable<Pelicula> getPeliculasRentables(){
        if (this.condiciones.isEmpty())
            return new ArrayList<>(this.peliculas);

        ArrayList<Pelicula> peliculasRentables = new ArrayList<>();
        for (Pelicula p : peliculas) {
            Boolean cumpleTodo = true;
            for (Filtro f : condiciones) {
                if (!f.cumple(p)){
                    cumpleTodo = false;
                    break;
                }
            }
            if (cumpleTodo){
                peliculasRentables.add(p);
            }
        }
        return peliculasRentables;
    }
    public static void main(String[] args) {}
}
