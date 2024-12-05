package busqueda_de_documentos.filtros;

import src.busqueda_de_documentos.Documento;

public class FiltroPalabraClave extends Filtro{
    private String palabra;
    public FiltroPalabraClave(String palabra) { this.palabra = palabra; }

    @Override
    public boolean cumple(Documento doc) {
        return doc.containsPalabraClave(palabra);
    }
}
