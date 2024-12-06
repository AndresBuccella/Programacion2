package busqueda_de_documentos.filtros;

import busqueda_de_documentos.Documento;

public class FiltroAutor extends Filtro{
    private String autor;
    public FiltroAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Documento doc) {
        return doc.containsAutor(this.autor);
    }
}
