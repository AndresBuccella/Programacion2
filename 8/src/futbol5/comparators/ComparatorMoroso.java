package futbol5.comparators;

import futbol5.Socio;

import java.util.Comparator;

public class ComparatorMoroso implements Comparator<Socio> {
    public int compare(Socio s1, Socio s2){
        return - s1.getUltimaCuota().compareTo(s2.getUltimaCuota()); //ordena primero los no morosos
    }
}
