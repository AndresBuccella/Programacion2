package futbol5.comparators;

import futbol5.Socio;

import java.util.Comparator;

public class ComparatorNombre implements Comparator<Socio> {

    public int compare(Socio s1, Socio s2){
        return s1.getNombre().compareTo(s2.getNombre());
    }
}
