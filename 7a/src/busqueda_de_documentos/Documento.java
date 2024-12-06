package busqueda_de_documentos;

import busqueda_de_documentos.filtros.Filtro;

import java.util.ArrayList;

public class Documento {

    private String titulo;
    private String contenido;
    private ArrayList<String> autores;
    private ArrayList<String> palabrasClave;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autores = new ArrayList<>();
        this.palabrasClave = new ArrayList<>();
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public void setAutores(String autor) {
        if (autor != null && !autor.equals("") && !this.autores.contains(autor)) {
            this.autores.add(autor);
        }
    }
    public void setPalabrasClave(String palabraClave) {
        if (palabraClave != null) {
            this.palabrasClave.add(palabraClave);
        }
    }

    public boolean containsPalabraClave(String palabraClave) {
        return this.palabrasClave.contains(palabraClave);
    }
    public boolean containsAutor(String autor) {
        return this.autores.contains(autor);
    }

    public int getCantPalabrasContenido(){
        return this.contenido
                .trim()
                .split("\\s+")
                .length;
    }

    public Documento cumple(Filtro filtro) {
        if (filtro.cumple(this))
            return this;
        return null;
    }


}
