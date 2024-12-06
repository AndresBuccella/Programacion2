package busqueda_de_documentos.filtros;

import busqueda_de_documentos.Documento;

public class FiltroTituloExacto extends Filtro {
    private String titulo;
    public FiltroTituloExacto(String titulo) { this.titulo = titulo; }

    @Override
    public boolean cumple(Documento doc) {
        return this.titulo.equals(doc.getTitulo());
    }
}
