package futbol5.comparators;

import futbol5.Socio;

import java.util.Comparator;

public class ComparatorApellido implements Comparator<Socio> {

    @Override
    public int compare(Socio s1, Socio s2) {
        return s1.getApellido().compareTo(s2.getApellido());
    }

}
