package futbol5;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private Boolean ultimaCuota; //horrible pero para lo que piden creo que safa
    private ArrayList<Alquiler> alquileres;

    public Socio(String nombre, String apellido, int edad, Boolean ultimaCuota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ultimaCuota = ultimaCuota;
        this.alquileres = new ArrayList<>();
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquileres.add(alquiler);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Boolean getUltimaCuota() {
        return ultimaCuota;
    }

    public void setUltimaCuota(Boolean ultimaCuota) {
        this.ultimaCuota = ultimaCuota;
    }

    public boolean alquiloCancha(Cancha cancha) {
        for(Alquiler alquiler : alquileres) {
            if (alquiler.getIdCancha() == cancha.getIdCancha()) {
                return true;
            }
        }
        return false;
    }

    public boolean pagoMasDe(Double precio){
        for(Alquiler alquiler : alquileres) {
            if (alquiler.getPrecio() > precio) {
                return true;
            }
        }
        return false;
    }
}
