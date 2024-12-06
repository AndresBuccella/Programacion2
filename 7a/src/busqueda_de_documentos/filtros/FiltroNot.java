package busqueda_de_documentos.filtros;

import busqueda_de_documentos.Documento;

public class FiltroNot extends Filtro {
    private Filtro filtroANegar;
    public FiltroNot(Filtro f) {
        this.filtroANegar = f;
    }
    @Override
    public boolean cumple(Documento doc) {
        return !this.filtroANegar.cumple(doc);
    }
}
