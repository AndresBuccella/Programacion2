package futbol5;

import java.time.LocalDateTime;

public class Alquiler {
    private int idCancha;
    private LocalDateTime fecha;
    private Double precio;

    public Alquiler(int id, Double precio, LocalDateTime fecha) {
        this.idCancha = id;
        this.precio = precio;
        this.fecha = fecha;
    }

    public int getIdCancha() {
        return idCancha;
    }
    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
