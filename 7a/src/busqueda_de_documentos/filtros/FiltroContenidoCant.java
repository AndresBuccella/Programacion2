package busqueda_de_documentos.filtros;

import busqueda_de_documentos.Documento;

public class FiltroContenidoCant extends Filtro {
    private int cantidad;
    public FiltroContenidoCant(int cantidad) { this.cantidad = cantidad; }
    public boolean cumple(Documento doc) {
        return doc.getCantPalabrasContenido() >= cantidad;
    }
}
