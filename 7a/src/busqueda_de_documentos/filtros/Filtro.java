package busqueda_de_documentos.filtros;

import src.busqueda_de_documentos.Documento;

public abstract class Filtro {
    public abstract boolean cumple(Documento doc);
}