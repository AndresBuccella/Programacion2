package busqueda_de_documentos.filtros;

import busqueda_de_documentos.Documento;

public class FiltroAnd extends Filtro {
    private Filtro filtroA;
    private Filtro filtroB;
    public FiltroAnd(Filtro filtroA, Filtro filtroB) { this.filtroA = filtroA; this.filtroB = filtroB; }

    @Override
    public boolean cumple(Documento doc) {
        return filtroA.cumple(doc) && filtroB.cumple(doc);
    }
}
