package busqueda_de_documentos.filtros;

import src.busqueda_de_documentos.Documento;

public class FiltroContenido extends Filtro {
    private String contenidoABuscar;
    public FiltroContenido(String contenidoABuscar) { this.contenidoABuscar = contenidoABuscar; }

    @Override
    public boolean cumple(Documento doc) {
        return doc.getContenido().contains(contenidoABuscar);
    }
}
