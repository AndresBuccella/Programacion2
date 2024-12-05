package busqueda_de_documentos.filtros;

import src.busqueda_de_documentos.Documento;

public class FiltroTituloParcial extends Filtro {

    private String titulo;
    public FiltroTituloParcial(String titulo) { this.titulo = titulo; }

    @Override
    public boolean cumple(Documento doc) {
        return this.titulo.contains(doc.getTitulo());
    }
}
