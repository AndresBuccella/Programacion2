package futbol5.comparators;

import futbol5.Socio;

import java.util.Comparator;

public class ComparatorCompuesto implements Comparator<Socio> {
    private Comparator<Socio> comparatorA;
    private Comparator<Socio> comparatorB;
    public ComparatorCompuesto(Comparator<Socio> comparatorA, Comparator<Socio> comparatorB) { this.comparatorA = comparatorA; this.comparatorB = comparatorB; }
    public int compare(Socio s1, Socio s2) {
        int result = comparatorA.compare(s1, s2);
        return (result != 0) ? result : comparatorB.compare(s1, s2);
    }
}
