package vivero;

import java.util.ArrayList;

public class Planta {
    private String nombreCientifico;
    private ArrayList<String> nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private String intOExt;
    private int requerimientoSol;
    private int requerimientoAgua;

    public Planta(String nombreCientifico, String clasificacionSuperior, String familia, String clase, int requerimientoSol, int requerimientoAgua) {
        this.nombreCientifico = nombreCientifico;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        this.requerimientoSol = requerimientoSol;
        this.requerimientoAgua = requerimientoAgua;
        this.nombresVulgares = new ArrayList<>();
    }

    public void setNombreVulgar(String nombreVulgar) {
        this.nombresVulgares.add(nombreVulgar);
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getIntOExt() {
        return intOExt;
    }

    public void setIntOExt(String intOExt) {
        this.intOExt = intOExt;
    }

    public int getRequerimientoSol() {
        return requerimientoSol;
    }

    public void setRequerimientoSol(int requerimientoSol) {
        this.requerimientoSol = requerimientoSol;
    }

    public int getRequerimientoAgua() {
        return requerimientoAgua;
    }

    public void setRequerimientoAgua(int requerimientoAgua) {
        this.requerimientoAgua = requerimientoAgua;
    }

    public boolean containsNombreVulgar(String nombreVulgar) {
        return nombresVulgares.contains(nombreVulgar);
    }


    @Override
    public String toString() {
        String nombresVulgares = "";
        for(String nombre : this.nombresVulgares ) {
            nombresVulgares += nombre + ", ";
        }
        return "Nombre cientifico: " + this.nombreCientifico +
                "Nombres vulgares: " + nombresVulgares +
                "Clasificacion superior: " + this.clasificacionSuperior +
                "Familia: " + this.familia +
                "Clase: " + this.clase +
                "Planta de " + this.intOExt +
                "Riego: " + this.requerimientoAgua +
                "Sol: " + this.requerimientoSol + "\n";
    }
}
