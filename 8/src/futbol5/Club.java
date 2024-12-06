package futbol5;

import futbol5.filtros.Filtro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Club {
    private ArrayList<Socio> socios;
    private ArrayList<Cancha> canchas;

    public Club() {
        this.socios = new ArrayList<>();
        this.canchas = new ArrayList<>();
    }
    public void addSocio(Socio s) {
        if(!this.socios.contains(s)) {
            this.socios.add(s);
        }
    }
    public void addCancha(Cancha c) {
        if (!this.canchas.contains(c)) {
            this.canchas.add(c);
        }
    }

    public Iterable<Socio> getSociosOrdenados(Filtro filtro, Comparator<Socio> orden) {
        ArrayList<Socio> sociosFiltradosYOrdenados = new ArrayList<>();
        for (Socio s: this.socios) {
            if(filtro.cumple(s))
                sociosFiltradosYOrdenados.add(s);
        }
        Collections.sort(sociosFiltradosYOrdenados, orden);
        return sociosFiltradosYOrdenados;
        //Profesional
        /*
        return socios.stream()
                .filter(filtro::cumple)
                .sorted(orden)
                .collect(Collectors.toList());*/
    }

}
